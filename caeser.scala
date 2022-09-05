object CeasarCipher{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	def encryption(): Unit = {
		//specify the amount to shift the alphabet
		print("Specify the shift")
		val amount = scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size
		val finalShift = amount % alphabet.size
		

			//Enter the code to be encrypted
		val code = scala.io.StdIn.readLine("Enter the code to be encrypted: ")

		val encryptedCode = code.map( (a: Char) => { 

			val x = alphabet.indexOf(a.toUpper)

			if (x == -1){
				a
			}else{
				alphabet((x + finalShift) % alphabet.size)
			} 
		});

		println(encryptedCode);
	}

	 def decryption(): Unit = {
		println("----Specify the shift----")
		val amount = scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size
		val finalShift = amount % alphabet.size
  

		//Enter the code to be encrypted
		val code = scala.io.StdIn.readLine("Enter the code to be decrypted: ")

		val encryptedCode = code.map( (a: Char) => { 

		val x = alphabet.indexOf(a.toUpper)

		if (x == -1){
			a
		}else{
			alphabet((x - finalShift) % alphabet.size)
		} 
		});

		println(encryptedCode);
	}
	def main(args: Array[String]) :Unit={
		encryption();
		print("decryption")
		decryption();
	}
	
}
 
