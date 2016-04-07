class Bob {
    val Numbers = """^([0-9 ,.!]*)$""".r
    val Shout = """^([0-9., ]*[A-Z !,.]+\??)$""".r
    val Question = """(.+\?)""".r
    val Silence = """(\s*)""".r
    def hey(msg: String):String = 
        msg match {
            case Silence(_) => "Fine. Be that way!"
            case Shout(_) => "Whoa, chill out!"
            case Question(_) => "Sure."
            case _ => "Whatever."   
        }
}
