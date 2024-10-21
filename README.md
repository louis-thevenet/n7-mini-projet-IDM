# Projet IDM
#n7
## A faire
- [ ] Renommer les projets qui ont pas la convention `fr.n7.___` 
  Vérifier ce que les TPs disaient
- [ ] Générer les livrables
- [X] Faire la transfo simplePDLToPetri avec ATL
- [X] Faire l'éditeur graphique simplePDL
- [ ] Faire la transfo `PetriNet` -> `LTL`
  - [X] Terminaison
  - [X] Invariant
- [ ] Finir le rapport
- [ ] Avoir un scénario de 10min 

## Livrables

> [!note] 
>  Mettre les livrables dans le dossier `livrables` sans structure particulière, bien respecter les conventions de nommage.


- [ ] Rendu du rapport 25/10/2024 #n7
  Il explique ce que vous avez fait, vos choix, les exemples réalisés, etc. Il doit être synthétique.
  Il est le point d’entrée sur le travail fait. Ne pas le négliger !
  Il est bien sûr conseillé de le rédiger au fur et à mesure de vos avancées. N’attendez pas la fin.

  - [X] Métamodèles 16/10/2024 #n7
    - [X] `SimplePDL.ecore`, `SimplePDL.aird` et `SimplePDL.png`
    - [X] `PetriNet.ecore`, `PetriNet.aird` et `PetriNet.png`

    - [X] `SimplePDL`
      - [X] Le code Java qui implante la sémantique statique de `SimplePDL`
        - [X] Peut-être trouver de nouvelles contraintes sur les ressources avant de faire le rendu
      - [X] des exemples de modèles `SimplePDL` sans erreur (pdl*) ou avec (ko-pdl*).
        Il doit y avoir en particulier `pdl-sujet.xmi` ou `pdl-sujet.simplepdl` qui correspond à l’exemple du sujet du projet

  - [X] `PetriNet` 01/10/2024 #n7
    - [X] Code Java de la sémantique statique de `PetriNet`, exemples de modèles avec et sans erreur (même nommage que `SimplePDL`)
    - [X] `SimplePDL2PetriNet.java`

  - [X] 04/10/2024 #n7
    - [X] `PetriNet2Tina.mtl` : la transformation de modèles `PetriNet` dans la syntaxe concrète de Tina (.net),
    - [X] `pdl-sujet.net` : le résultat de la transformation appliquée sur l’exemple du sujet,
    - [X] `simplePDL.odesign` : le fichier de définition de l’éditeur graphique pour `SimplePDL`,
    - [X] `simplePDL-editor.png` : l’exportation d’un modèle de processus saisi avec l’éditeur graphique (il doit démontrer les possibilités de l’éditeur proposé en terme de visualisation d’un modèle de processus).
  - [X] `Xtext` 15/10/2024 #n7
    - [X] `SimplePDL.xtext` qui définit la syntaxe textuelle pour `SimplePDL`. Attention, ce doit être une syntaxe facile à utiliser pour une personne devant définir un processus. Le principe est de compléter l’une des syntaxes concrètes fournies. En aucun cas il faut se contenter de faire engendrer une syntaxe à `Xtext`!
    - [X] `SimplePDL2PetriNet.atl` : transformation de `SimplePDL` en `PetriNet`,
  - [X] LTL  18/10/2024 #n7
    - [X] `SimplePDL-finish.mtl` : transformation M2T qui engendre les propriétés LTL qui vérifient la terminaison d’un processus. Voir le transparent 117 et suivants du cours IDM (voir Ressources ci-dessous).
    - [X] `SimplePDL-invariants.mtl` : transformation M2T qui engendre les propriétés LTL pour valider la correction de la transformation (T11) des modèles de processus vers les réseaux de Petri.


## Documents à rendre
- D1 Les métamodèles SimplePDL et PetriNet (ainsi que des images de ces métamodèles).
- D2 Les fichiers Java des contraintes associées à ces métamodèles, avec des exemples (et contreexemples) qui montrent la pertinence de ces contraintes.
- D3 Le code Java de la transformation modèle à modèle.
- D4 Le code ATL de la transformation modèle à modèle.
- D5 Le code Acceleo des transformations modèle à texte.
- D6 Les modèles Sirius décrivant l’éditeur graphique pour SimplePDL.
- D7 Le modèle Xtext décrivant la syntaxe concrète textuelle de SimplePDL.
- D8 Des exemples de modèles de processus (en expliquant leur intérêt).
- D9 Un document concis (rapport) qui explique le travail réalisé. Attention, c’est ce document
qui servira de point d’entrée pour lire les éléments rendus.


## Liens utiles
- [Sujet du projet](http://xc4ens.free.fr/ens/2024-2sn-gls/CONTENU/IDM/gls-idm-2sn-2024-mp-01-sujet.pdf)
- [Livrables]([http://xc4ens.free.fr/ens/2024-2sn-gls/gls-2sn-2024-deroulement-corrige017.html)
