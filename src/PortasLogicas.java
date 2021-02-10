public class PortasLogicas {

    public static void main(String[] args) {
        PortasOR portaOR = new PortasOR();
        System.out.println(portaOR.testePortaOR(false, false)); //1)
        System.out.println(portaOR.testePortaOR
                (false, portaOR.testePortaOR(false, portaOR.testePortaOR(false, portaOR.testePortaOR
                        (false, portaOR.testePortaOR(false, portaOR.testePortaOR(false, false))))))); //2)
        System.out.println("A+B+C+D+E+F");//2)
        System.out.println(portaOR.testePortaOR(true, portaOR.testePortaOR(true, true))); //3)

        PortasAND portaAND = new PortasAND();
        System.out.println(portaAND.testePortaAND
                (false, portaAND.testePortaAND(true, portaAND.testePortaAND(true, portaAND.testePortaAND
                        (true, true))))); //1)
        System.out.println(portaAND.testePortaAND(true, false)); //2)
        System.out.println(portaAND.testePortaAND(true, false)); //3)

        PortasNOT portasNOT = new PortasNOT();
        boolean verdadeiro = portasNOT.testePortaNOT(true);
        System.out.println(portasNOT.testePortaNOT(verdadeiro));//1)
        boolean x = portaAND.testePortaAND(true, true);
        boolean y = portasNOT.testePortaNOT(x); //2)
        System.out.println(" Y será BAIXO somente para A = B = " + y);


    }
}
