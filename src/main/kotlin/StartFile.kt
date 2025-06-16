
fun convert(color: Int):String {
    return color.toString(16)
}

fun main() {

    val r = Numbers.Number();
    val g = Numbers.Number();
    val b = Numbers.Number();

    val colorR = convert(r);
    val colorG = convert(r);
    val colorB = convert(r);

    println("R: $r");
    println("G: $g");
    println("B: $b");

    println("#$colorR $colorG $colorB")
}
