= Scénario Oral

- Montrer exemple `exemple.pdl3`
  + En plain texte
  + En Ecore

- Transformation `SimplePDL3` $arrow$ `SimplePDL`
  + Montrer le Ecore
  // + Ouvrir dans l'éditeur graphique ?

- Transformation `SimplePDL` $arrow$ `DOT`
  + L'ouvrir depuis Eclipse

- Transformation `SimplePDL` $arrow$ `PetriNet` (Utiliser l'exemple `pdl-sujet-ressources` ici)
  - Par Java
    + Montrer le Ecore
    + Transformation `PetriNet` $arrow$ `DOT`
    + L'ouvrir depuis Eclipse

  - Par ATL
    + Montrer le Ecore
    + Transformation `PetriNet` $arrow$ `DOT`
    + Comparer avec celui par Java

- Transformation `PetriNet` $arrow$ `TINA`
  + L'ouvrir
- Transformation `PetriNet` $arrow$ `LTL`
  + tina fichier.net fichier.ktz
  + `selt -p fichier.ktz -prelude fichier.ltl`
