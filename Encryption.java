class Encryption extends ConsoleProgram {

  /**
  * A program the encrypts a message inputted by the user
  * @author: 
  */
  String strmessagea;
  int intshifta;
  public void run() {
  
    System.out.println("**** Encryption Program *****");
    strmessagea = readLine("Enter the message to encrypt: ");
    intshifta = readInt("Enter the shift amount: ");
    System.out.println((encryptedMessage(strmessagea, intshifta)));
    }

  public String encryptedMessage(String strMessage, int intShift) {
    String strMessageCoded = "";

    for (int intCounter = 0; intCounter > strMessage.length(); intCounter ++) {
      strMessage.charAt(intCounter);
    }
    return strMessageCoded;
}

  }