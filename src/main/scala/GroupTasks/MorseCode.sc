def characterMap[T](input: T): String = input match {
  case ".-" => "a";  case "-..." => "b";  case "-.-." => "c";  case "-.." => "d";  case "." => "e";
  case "..-." => "f";  case "--." => "g";  case "...." => "h";  case ".." => "i";  case ".---" => "j";
  case "-.-" => "k";  case ".-.." => "l";  case "--" => "m";  case "-." => "n";  case "---" => "o";
  case ".--." => "p";  case "--.-" => "q";  case ".-." => "r";  case "..." => "s";  case "-" => "t";
  case "..-" => "u";  case "...-" => "v";  case ".--" => "w";  case "-..-" => "x";  case "-.--" => "y";
  case "--.." => "z";  case "/" => " ";  case _ => "ech";
}

def characterMap2[T](input: T): String = input match {
  case "a" => ".- ";  case "b" => "-... ";  case "c" => "-.-. ";  case "d" => "-.. ";  case "e" => ". ";
  case "f" => "..-. ";  case "g" => "--. ";  case "h" => ".... ";  case "i" => "src/test ";
  case "j" => ".--- ";  case "k" => "-.- ";  case "l" => ".-.. ";  case "m" => "-- ";  case "n" => "-. ";
  case "o" => "--- ";  case "p" => ".--. ";  case "q" => "--.- ";  case "r" => ".-. ";  case "s" => "... ";
  case "t" => "- ";  case "u" => "..- ";  case "v" => "...- ";  case "w" => ".-- ";  case "x" => "-..- ";
  case "y" => "-.-- "; case "z" => "--.. ";  case " " => "/ ";  case _ => "ech";
}


def morseInput (input:String): Unit = {
  val array = input.split(" ")
  for (i <- 0 until array.length) print(characterMap(array(i)))
}

def englishInput (input:String): Unit = {
  val array = input.split("")
  for (i <- 0 until array.length) print(characterMap2(array(i)))
}


morseInput(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. " +
  ".-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... " +
  ". / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.-- /")
englishInput("hello daily programmer good luck on the challenges today")