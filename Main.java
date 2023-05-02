
public class Main{
    public static void main(String args[]){
        RubiksCube nc = new RubiksCube();
        
        nc.shuffleCube();
        nc.botFaceTurn();
        /**        
        nc.botFaceTurn();
        nc.fFaceTurn();
        nc.backFaceTurn();
        nc.lFaceTurn();
        nc.tFaceTurn();
        nc.lFaceTurn();
        nc.botFaceTurn();
        nc.botFaceTurn();
        nc.lFaceTurn();
        nc.rFaceTurn();
        nc.backFaceTurn();
        nc.rFaceTurn();
        nc.rFaceTurn();
        nc.rFaceTurn();
        nc.tFaceTurn();
        nc.rFaceTurn();
        nc.rFaceTurn();
        nc.backFaceTurn();
        nc.lFaceTurn();
        nc.rFaceTurn(); 
        */
        
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
