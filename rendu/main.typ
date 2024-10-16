#import "./template.typ": *

#show: project.with(
  subject: "Ingénierie Dirigée par les Modèles",
  title: "Mini-Projet IDM",
  authors: ("THEVENET Louis", "SABLAYROLLES Guillaume",),
  date: "Octobre 2024",
  subtitle: "Groupe L34-02",
  toc: true,
)


= Méta-Modèles 
== SimplePDL
#figure(image("assets/SimplePDL.svg", height: 50%, width: 115%, fit: "stretch"), caption: [Méta-Modèle de SimplePDL])


A partir du méta-modèle fourni, nous avons rajouté l'utilisation des ressources.
Une ressource est défini comme une EClass Resource ayant un nom (`name`) et un nombre total d'éléments disponible pour cette ressource (`total`).


Ensuite, Resource peut être manipulé par les WorkDefiniton grâce aux ResourceUsage : les ResourceUsage définissent le nombre d'une Resource demandées (`need`) par la WorkDefinition ainsi que le nom de la Resource demandée (`name`).


L'utilisation de ResourceUsage nous permet de partager l'utilisation d'une même Resource entre différente WorkDefinition.

== PetriNet

#figure(image("assets/PetriNet.svg", height: 50%, width: 115%, fit: "stretch"), caption: [Méta-Modèle de PetriNet])


Pour définir un PetriNet, nous avons repris le principe de SimplePDL : un réseau `PetriNet` est un ensemble de NetElements où les NetElements représentes les éléments d'un réseau de Petri : Place, Transition et Arc.

Une Place est définie par un nom (`name`) et le nombre de jetons présents (`tokens`). 

Pour définir une Transition il faut qu'elle est un nom (`name`) et l'intervalle de temps sur laquelle elle est franchissable (entre `tempsMin` et `tempsMax`,  l'option `tempsMaxBorne` indique si cette transition est franchissable pendant une infinité de temps après le début possible).

Enfin, pour relier une place et une transition (ou transition et place), il faut utiliser des `Arc`. Un `Arc` est paramétré par son nom (`name`), un poids (`wieght`, initialisé à 1), par son type (`arcType`) permettant de le définir comme un arc ou un read arc (défini dans l'enum `ArcType`) et, le plus important, sa direction (`linkDirection`) pour différentier `Place` $arrow.r$ `Transtion` et `Transition` $arrow.r$ `Place` (défini dans l'enum `LinkDirection`).

Différentier les arcs, que ce soit pour les read arcs ou les directions, est un point clé de ce méta-modèle pour les modèles conformes, permettant de les distinguer et d'effectuer des traitements plus rapidement sur eux.


= Transformation Modèle à Modèle
== SimplePDL vers PetriNet
=== Java/EMF

Java et EMF nous permettent d'obtenir des structures arborescentes de nos modèles.

Pour réaliser notre transformation SimplePDL vers PetriNet nous nous sommes basés sur l'algorithme donné :
    - Une `WorkDefinition` devient 4 `Places` et 2 `Transitions`  
    - Une `WorkSequence` devient un `ReadArc` entre les places $arrow.r$ transition `Started $arrow.r$ Start` et `Finished $arrow.r$ Finish` 
pour pouvoir déterminer comment implémenter la transformation d'une `Resource` en `PetriNet`.

D'abord une `Resource` possède un certains nombre d'éléments (que les `WorkDefinition` utilisent pour fonctionner) donc nous avons eu l'idée de transformer `Resource` en une `Place(name: Resource.name, tokens: Resource.toal)` ie une place avec le nombre de jetons égal au nombre de ressources disponibles.

=== ATL

= Transformation Modèle à Texte

= Transformation Texte à Modèle