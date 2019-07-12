/**
 * Java8 POO + Constru��es Funcionais
 * Cap�tulo 7, p�gina 255
 *
 * @author      F. M�rio Martins
 * @version     12/07/2019
 */
public class TesteStackLim {
    public static void main(String [] args) {
        StackLim stack1 = new StackLim(5);
        
        try {
            stack1.push("anos"); 
            stack1.push(20);
            stack1.push("tem");
            stack1.push("Maria");
            stack1.push("A");
        } catch(StackCheiaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        System.out.println(stack1.output());
    }
}
