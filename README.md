# Projet IDM

#n7

## A faire

- [ ] Renommer les projets qui ont pas la convention `fr.n7.___`
      Vérifier ce que les TPs disaient p-ê
- [x] (re)Générer les livrables
- [x] Finir le rapport
  - [x] Eventuellement mieux présenter LTL
  - [x] Pour conclure le rapport on devrait discuter du fait que le LTL n'est PAS vérifié sur le process du sujet
        c-à-d montrer chaque étape des transfos, et pour finir bah on a réussi à montrer que le process marchait pas
        A mon avis c'est ça le but du sujet du mini-projet ?
- [x] Faire la transfo simplePDLToPetri avec ATL
- [x] Faire l'éditeur graphique simplePDL
- [x] Faire la transfo `PetriNet` -> `LTL`
  - [x] Terminaison
  - [x] Invariant
- [x] Avoir un scénario de 10min

## Livrables

> [!note]
> Mettre les livrables dans le dossier `livrables` sans structure particulière, bien respecter les conventions de nommage.

- [x] Rendu du rapport 25/10/2024 #n7
      Il explique ce que vous avez fait, vos choix, les exemples réalisés, etc. Il doit être synthétique.
      Il est le point d’entrée sur le travail fait. Ne pas le négliger !
      Il est bien sûr conseillé de le rédiger au fur et à mesure de vos avancées. N’attendez pas la fin.

  - [x] Métamodèles 16/10/2024 #n7

    - [x] `SimplePDL.ecore`, `SimplePDL.aird` et `SimplePDL.png`
    - [x] `PetriNet.ecore`, `PetriNet.aird` et `PetriNet.png`

    - [x] `SimplePDL`
      - [x] Le code Java qui implante la sémantique statique de `SimplePDL`
        - [x] Peut-être trouver de nouvelles contraintes sur les ressources avant de faire le rendu
      - [x] des exemples de modèles `SimplePDL` sans erreur (pdl*) ou avec (ko-pdl*).
            Il doit y avoir en particulier `pdl-sujet.xmi` ou `pdl-sujet.simplepdl` qui correspond à l’exemple du sujet du projet

  - [x] `PetriNet` 01/10/2024 #n7

    - [x] Code Java de la sémantique statique de `PetriNet`, exemples de modèles avec et sans erreur (même nommage que `SimplePDL`)
    - [x] `SimplePDL2PetriNet.java`

  - [x] 04/10/2024 #n7
    - [x] `PetriNet2Tina.mtl` : la transformation de modèles `PetriNet` dans la syntaxe concrète de Tina (.net),
    - [x] `pdl-sujet.net` : le résultat de la transformation appliquée sur l’exemple du sujet,
    - [x] `simplePDL.odesign` : le fichier de définition de l’éditeur graphique pour `SimplePDL`,
    - [x] `simplePDL-editor.png` : l’exportation d’un modèle de processus saisi avec l’éditeur graphique (il doit démontrer les possibilités de l’éditeur proposé en terme de visualisation d’un modèle de processus).
  - [x] `Xtext` 15/10/2024 #n7
    - [x] `SimplePDL.xtext` qui définit la syntaxe textuelle pour `SimplePDL`. Attention, ce doit être une syntaxe facile à utiliser pour une personne devant définir un processus. Le principe est de compléter l’une des syntaxes concrètes fournies. En aucun cas il faut se contenter de faire engendrer une syntaxe à `Xtext`!
    - [x] `SimplePDL2PetriNet.atl` : transformation de `SimplePDL` en `PetriNet`,
  - [x] LTL 18/10/2024 #n7
    - [x] `SimplePDL-finish.mtl` : transformation M2T qui engendre les propriétés LTL qui vérifient la terminaison d’un processus. Voir le transparent 117 et suivants du cours IDM (voir Ressources ci-dessous).
    - [x] `SimplePDL-invariants.mtl` : transformation M2T qui engendre les propriétés LTL pour valider la correction de la transformation (T11) des modèles de processus vers les réseaux de Petri.

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
