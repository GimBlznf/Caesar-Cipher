object CeasarCipher extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  //specify the amount to shift the alphabet
  print("Specify the shift")
	val amount = scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size
  val finalShift = amount % alphabet.size
  

	//Enter the code to be encrypted
	val code = scala.io.StdIn.readLine("Enter the code to be encrypted: ")

	val encryptedCode = inputText.map( (a: Char) => { 

		val x = alphabet.indexOf(a.toUpper)

		if (x == -1){
			a
		}
		else{
			alphabet((x + shift) % alphabet.size)
			} 
	});

	println(outputText);
}


object DecryptCaesor extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val code = scala.io.StdIn.readLine("Enter the code to be decrypted: ")
  
  println("----Specify the shift----")
	val amount = scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size
  val finalShift = amount % alphabet.size
  

	//Enter the code to be encrypted
	val code = scala.io.StdIn.readLine("Enter the code to be decrypted: ")

	val encryptedCode = inputText.map( (a: Char) => { 

		val x = alphabet.indexOf(a.toUpper)

		if (x == -1){
			a
		}
		else{
			alphabet((x - shift) % alphabet.size)
			} 
	});

	println(outputText);
}
