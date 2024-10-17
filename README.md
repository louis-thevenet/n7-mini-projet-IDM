# Projet IDM
#n7
## A faire
- [ ] Dans PetriNet2Dot:
  ajouter le nombre de jetons d'une place dans le node
  regénérer l'exemple simple dans le rapport

## Livrables

> [!note] 
>  Mettre les livrables dans le dossier `livrables` sans structure particulière, bien respecter les conventions de nommage.


- [ ] Rendu du rapport 25/10/2024 #n7
  Il explique ce que vous avez fait, vos choix, les exemples réalisés, etc. Il doit être synthétique.
  Il est le point d’entrée sur le travail fait. Ne pas le négliger !
  Il est bien sûr conseillé de le rédiger au fur et à mesure de vos avancées. N’attendez pas la fin.

  - [ ] Métamodèles 16/10/2024 #n7
    - [ ] `SimplePDL.ecore`, `SimplePDL.aird` et `SimplePDL.png`
    - [ ] `PetriNet.ecore`, `PetriNet.aird` et `PetriNet.png`

    - [ ] `SimplePDL`
      - [ ] Le code Java qui implante la sémantique statique de `SimplePDL`
        - [ ] Peut-être trouver de nouvelles contraintes sur les ressources avant de faire le rendu
      - [ ] des exemples de modèles `SimplePDL` sans erreur (pdl*) ou avec (ko-pdl*).
        Il doit y avoir en particulier `pdl-sujet.xmi` ou `pdl-sujet.simplepdl` qui correspond à l’exemple du sujet du projet

  - [ ] `PetriNet` 01/10/2024 #n7
    - [ ] Code Java de la sémantique statique de `PetriNet`, exemples de modèles avec et sans erreur (même nommage que `SimplePDL`)
    - [ ] `SimplePDL2PetriNet.java`
    - [X] Renommer `ProcessToPetri`

  - [ ] 04/10/2024 #n7
    - [ ] `PetriNet2Tina.mtl` : la transformation de modèles `PetriNet` dans la syntaxe concrète de Tina (.net),
    - [ ] `pdl-sujet.net` : le résultat de la transformation appliquée sur l’exemple du sujet,
    - [ ] `simplePDL.odesign` : le fichier de définition de l’éditeur graphique pour `SimplePDL`,
    - [ ] `simplePDL-editor.png` : l’exportation d’un modèle de processus saisi avec l’éditeur graphique (il doit démontrer les possibilités de l’éditeur proposé en terme de visualisation d’un modèle de processus).
  - [ ] `Xtext` 15/10/2024 #n7
    - `SimplePDL.xtext` qui définit la syntaxe textuelle pour `SimplePDL`. Attention, ce doit être une syntaxe facile à utiliser pour une personne devant définir un processus. Le principe est de compléter l’une des syntaxes concrètes fournies. En aucun cas il faut se contenter de faire engendrer une syntaxe à `Xtext`!
    - `SimplePDL2PetriNet.atl` : transformation de `SimplePDL` en `PetriNet`,
  - [ ]  18/10/2024 #n7
    - `SimplePDL-finish.mtl` : transformation M2T qui engendre les propriétés LTL qui vérifient la terminaison d’un processus. Voir le transparent 117 et suivants du cours IDM (voir Ressources ci-dessous).
    - `SimplePDL-invariants.mtl` : transformation M2T qui engendre les propriétés LTL pour valider la correction de la transformation (T11) des modèles de processus vers les réseaux de Petri.


## Liens utiles
- [Sujet du projet](http://xc4ens.free.fr/ens/2024-2sn-gls/CONTENU/IDM/gls-idm-2sn-2024-mp-01-sujet.pdf)
- [Livrables]([http://xc4ens.free.fr/ens/2024-2sn-gls/gls-2sn-2024-deroulement-corrige017.html)
