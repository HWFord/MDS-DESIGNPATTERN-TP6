package com.tactfactory.designpatternniveau1.observer.tp1;

/**
*
* @author tactfactory
*
* - Le programme doit utiliser un design pattern "Observer" afin d'avoir les éléments suivant :
*   - 1 : Un Subject sera observé par 3 observer
*   - 2 : Le Subject possédera un state de type int
*   - 3 : Lors de la modification du state du Subject les observers attachés seront appelé avec :
*       - 1 : Un observer affichera l'entier en hexadécimal
*       - 2 : Un observer affichera l'entier en octal
*       - 3 : Un observer affichera l'entier en binaire
*   - 3 : Le lancement de l'application doit afficher les éléments suivant :
*
*       First state change: 15
*       Hex String: F
*       Octal String: 17
*       Binary String: 1111
*       Second state change: 10
*       Hex String: A
*       Octal String: 12
*       Binary String: 1010
*/
public class ObserverTp1 {
  public static void main(String[] args) {

	  Subject subject1 = new Subject();

	  new HexConcreteObserver(subject1);
	  new OctalConcreteObserver(subject1);
	  new BinaryConcreteObserver(subject1);

	  System.out.println("The first state change is 15");
	  subject1.setState(15);
	  System.out.println("The first state change is 10");
	  subject1.setState(10);
	  System.out.println("The third state change is 205");
	  subject1.setState(205);
	  System.out.println("The fourth state change is 64");
	  subject1.setState(64);

  }
}
