# Esquisse

Application mobile de partage de lieux urbains visuellement insolites !

## Authors

- Apolline DIAZ
- Nicolas PERROTIN
- Sam LAVAZAIS
- Chloé PELERIN
- Eliana YEPEZ
- Zachary JORIOT

## Tech Stack

**Front-end (mobile) :** Android Studio, Kotlin, JetPack Compose

**Back-end :** Spring Boot, Kotlin, PostGreSQL


****************************
# MVP
Sont listées ici seulement les fonctionnalités qui ont pu être mises en place.

## Front-end
- Une vue pour afficher l'ensemble des lieux disponibles
  - Filtres et tris selon leurs caractéristiques
- Une vue détaillée pour chaque produit : toutes les infos + carrousel de photos
- Une vue pour ajouter un lieu
- Navigation entre les différentes vues via barre de navigation

## Back-end
- API REST (opérations CRUD) :
  - obtenir tous les lieux
  - obtenir un lieu en particulier
  - ajouter un lieu
  - supprimer un lieu
  - mettre à jour un lieu
- Architecture : entités, models, repositories, services, controllers
- Connexion à une DB PostGreSQL via ORM

****************************
## Développements futurs (?)

### Front-end
- Une vue register
- Une vue login
- Récupération des coordonnées GPS et calcul des distances avec chaque lieu
- Affichage des points sur une carte interactive

### Back-end
- Entité User et repo/services/controllers dédiés
- Authentification middleware
