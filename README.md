# EpsiFR_JavaEE_ProjetLocationVoiture
Logiciel de location de voiture dans le cadre d'un projet de cours pour epsi toulouse.


Logiciel réalisé par GONZALEZ Victor, B3 Devops


Par contrainte de temps, je n'ai pas pu finir l'affichage du site, cependant le back-end est complet et fonctionnel :

## src

Dans le dossier src se trouvent chaque classe et servlet java pour le back-end, séparés selon le domaine pour lequel ils seront utilisés : Gestionnaire, Responsable, Mécanicien et Global pour ceux employés dans l'application dans son ensemble.

### Global\Class\Launch
Class Java qui aurait permit d'initialiser les valeurs dès l'ouverture de l'application. Je n'ai pas eu le temps de lier cela au reste du projet.

### Global\Servlet\Init
Servlet qui aurait permit d'initialiser les valeurs pour l'application. Cependant je n'ai pas réussi à l'appeler sur l'application, le projet ne reconaissant pas l'url "/Init" que je lui avait attribué.

### Responsible\Class\Voiture
La Class Java "Voiture" permettant de générer des voitures avec toutes les propriétés demandées. Il y a également une propriété "ListeReparation" de type ArrayList<Reparation> que je détaillerais plus loin.
Des object "Voiture" sont générés dans le Init ou le Launch à la base, puis sauvegardés sur la session pour l'Init et sur l'application pour le Launch.
  
### Mechanician\Class\Reparation
La Class Java "Reparation" qui permet au mécanicien d'enregistrer les réparations faitent sur une Voiture, avec une propriété "VoitureReparer" de type "Voiture" afin d'avoir directement accès à tous les détails de celle-ci.

### Mechanician\Servlet\addReparation
Ce Servlet a pour but de récupérer les détails d'une réparation entré par le mécanicien via un formulaire sur sa page dédiée afin de créer un nouvel Objet "Reparation" grâce à celles-ci. La Reparation ainsi créée va automatiquement être ajoutée dans la propriété "ListeReparation" de l'Objet "Voiture" concerné (Stocké dans une ArrayList" et ensuite actualisé dans la session / l'application.
