
# ROBOT SIMULATOR
  
### DOCUMENTATION

Ce projet à pour but de simuler le déplacement d'un robot sur une grille à deux dimensions. Le robot commence à l'emplacement (0; 0) et se déplace selon un chemin prédéfinit. (Voir la sous-partie EXECUTION à ce sujet)

Chaque déplacement va non seulement modifier la position du robot, mais également son orientation, ce qui va logiquement influer sur la suite de ses déplacements.

À chaque pas, la position ainsi que l'orientation du robot seront affichés à l'écran, et ce, jusqu'à ce que le robot ait terminé son parcours.

### EXECUTION

Pour executer le programme, deux solution s'offrent à vous :

1. Éxecuter le programme directement depuis votre JRE. Pour cela, il vous suffit de double cliquer sur le fichier "Robot Simulator.jar" ou d'indiquer dans le terminal la commande suivante :

`java -jar Robot\ Simulator.jar`

En faisant cela, un chemin d'une vingtaine de pas sera généré aléatoirement, et le robot commencera à le parcourir.

2. Vous avez également la possibilité d'indiquer votre propre chemin. Pour cela, vous devrez impérativement passer par le terminal, et utiliser la commande présentée dans la première étape, en y indiquant le chemin que vous désirez.

`java -jar Robot\ Simulator.jar -LRA`

L'avantage de cette méthode est qu'elle vous permet d'indiquer un chemin aussi long que nécéssaire. En effet, chaque lettre indiqué en paramètre sera un pas supplémentaire.

La lettre en question indique la direction à prendre par le robot. (L => Left; R => Right; A => Advance)

### TEST

Pour tester le programme, la meilleur solution est de tester chaque direction séparemment, en l'indiquant comme presentée ci-dessus.

Nous allons donc commencer par vérifier que le robot avance correctement. 

`java -jar Robot\ Simulator.jar -A`

En exécutant cette commande, le robot démarre à la position (0; 0) et termine en (0; 1; North) , soit une case au dessus de sa position initiale.

Ensuite, nous pouvons tester le déplacement à gauche. Pour cela, reprenons la commande ci-dessus en changeant la direction.

`java -jar Robot\ Simulator.jar -L`

Cette fois-ci, le robot termine sa course à la position (-1; 0; Weast), soit une case à gauche, en regardant sur la gauche, comme prévu.

Enfin, il faut également vérifier le déplacement à droite, en reprenant la même syntaxe que précédemment.

`java -jar Robot\ Simulator.jar -R`

Le robot termine désormais le parcours à la position (1; 0; East), comme prévu.

Évidemment, pour améliorer la couverture de code, il faudrait également vérifier ces 3 déplacements depuis les autres direction. Ici, le robot démarrait face au nord, mais ce ne sera pas toujours le cas.
Pour un départ de la gauche, nous pourrions tester les exemples suivants :

`java -jar Robot\ Simulator.jar -LA`  
`java -jar Robot\ Simulator.jar -LL`  
`java -jar Robot\ Simulator.jar -LR`  

Comme précédemment, le robot termine ce parcours aux emplacements prévus.
Ensuite, testons depuis un départ à droite.

`java -jar Robot\ Simulator.jar -RA`  
`java -jar Robot\ Simulator.jar -RL`  
`java -jar Robot\ Simulator.jar -RR`  

Encore une fois, tout fonctionne comme prévu.
Enfin, il nous reste à tester depuis un départ après un demi-tour, soit face au sud.

`java -jar Robot\ Simulator.jar -LLA`  
`java -jar Robot\ Simulator.jar -LLL`  
`java -jar Robot\ Simulator.jar -LLR`  

Ces quelques exemples permettent de vérifier l'intégralité des déplacements possibiles par notre robot. En s'assurant qu'ils fonctionnent correctement de façon séparés, nous seront certains que ce sera également le cas au milieu du parcours du robot.
