#import "./template.typ": *

#show: project.with(
  subject: "Ingénierie Dirigée par les Modèles", title: "Mini-Projet IDM", authors: ("THEVENET Louis", "SABLAYROLLES Guillaume",), date: "Octobre 2024", subtitle: "Groupe L34-02", toc: true,
)

= Méta-Modèles
== SimplePDL
#figure(
  image("assets/SimplePDL.svg", height: 50%, width: 115%, fit: "stretch"), caption: [Méta-Modèle de SimplePDL],
)

A partir du méta-modèle fourni, nous avons rajouté l'utilisation des ressources.
Une ressource est défini comme une EClass `Resource` ayant :
- un nom
- et un nombre total d'éléments disponible (`total`)

Une `WorkDefinition` utilise une `Resource` en ajoutant une référence à une `ResourceUsage` qui
contient :
- référence à la `Resource` en question
- la quantité demandée (`need`)

== Exemples
Ici mettre des exemples

== PetriNet

#figure(
  image("assets/PetriNet.svg", height: 50%, width: 115%, fit: "stretch"), caption: [Méta-Modèle de PetriNet],
)

Un `PetriNet` est constitué de `NetElement`. Ces éléments sont les `EClass` `Place`, `Transition` et `Arc`.

Une `Place` est définie par un nom et un nombre de jetons (`tokens`).

Une `Transition` est définie par un nom.

Un `Arc` contient :
- un nom
- un poids
- une référence vers une `Place`
- une référence vers une `Transition`
- Une `LinkDirection` (soit `placeToTransition`, soit `transitionToPlace`)
- Un `arcType` (soit `arc`, soit `readArc`).

Nous avons également ajouté des attributs `tempsMin`, `tempsMax` et `tempsMaxBorne` pour
ajouter la notion de temps aux `Transition`.

Ce méta-modèle permet de s'assurer que les `Arc` ne relient jamais deux `Transition` ou
deux `Place`.

= Transformation Modèle à Modèle
== SimplePDL vers PetriNet
=== Java/EMF

Principe de la transformation d'un modèle de processus en réseau de Petri:

- Un élément `Process` devient un élément `PetriNet`

- Une `WorkDefinition` devient 4 places `ready` (avec 1 jeton), `started`, `running` et `finished` et
  deux transitions `start` et `finish`

- Une `WorkSequence` devient un read-arc entre une place de l’activité précédente
  (`started` ou `finished`) et une transition de l’activité cible (`start` ou `finish`)

Transformation des ressources :

- Une `Resource` devient une place dont le nombre de jetons est égal au nombre de
  ressources initialement disponibles

- Une `ResourceUsage` devient deux arcs avec pour poids le nombre de ressources
  demandé :
  - De la place représentant la `Resource` utilisée à la transition `start` de la `WorkDefinition`
  - De la transition `finish` de la `WorkDefinition` à la place représentant la `Resource` utilisée

Lors de la transformations, on traite les `ProcessElement` dans cet ordre :
+ `Process`
+ `Resource`
+ `WorkDefinition`
  - `ResourceUsage` (on traite les `ResourceUsage` attachées à la `WorkDefinition` courante)
+ `WorkSequence`

#figure(
  image("assets/pdl-exemple-place-ressource.svg"), caption: [Entrée : modèle de processus simple avec une ressource],
)
#figure(
  image("assets/petrinet-exemple-place-ressource.svg"), caption: [Sortie : réseau de Petri résultant (les read-arc sont affichés à l'envers)],
)

On distingue aisément les différents sous-réseaux de Petri associés aux `WorkDefinition` ainsi
que la `Ressource` et les arcs qui la relient au sous-réseau associé à _Programmer_

// Java et EMF nous permettent d'obtenir des structures arborescentes de nos
// modèles.

// Pour réaliser notre transformation SimplePDL vers PetriNet nous nous sommes
// basés sur l'algorithme donné :
// - Une `WorkDefinition` devient 4 `Places` et 2 `Transitions`
// - Une `WorkSequence` devient un `ReadArc` entre les places $arrow.r$ transition `Started $arrow.r$ Start` et `Finished $arrow.r$ Finish`
// pour pouvoir déterminer comment implémenter la transformation d'une `Resource` en `PetriNet`.

// D'abord une `Resource` possède un certains nombre d'éléments (que les `WorkDefinition` utilisent
// pour fonctionner) donc nous avons eu l'idée de transformer `Resource` en une `Place(name: Resource.name, tokens: Resource.toal)` ie
// une place avec le nombre de jetons égal au nombre de ressources disponibles.

=== ATL

= Transformation Modèle à Texte

= Transformation Texte à Modèle
