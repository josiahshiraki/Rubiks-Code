
public class Main{
    public static void main(String args[]){
        RubiksCube nc = new RubiksCube();
        
        nc.shuffleCube();
        
        nc.printCube();
        System.out.println();
        
        nc.makeDaisy();
        nc.moveWhiteDown();
        nc.flipCube();
        nc.printCube();
        nc.insertCorners();

        nc.flipCube();
        
        nc.printCube();
        
        nc.insertEdges();
        
        nc.solveYellowCross();
        nc.solveYellCorners();
        
        nc.orientYellCorners();
    }    
}
