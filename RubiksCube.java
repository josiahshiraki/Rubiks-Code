import java.util.ArrayList;
public class RubiksCube{
    private int [][] frontFace;
    private int [][] backFace;
    private int [][] leftFace;
    private int [][] rightFace;
    private int [][] botFace;
    private int [][] topFace;
    
    private final int R = 1;
    private final int B = 2;
    private final int G = 3;
    private final int O = 4;
    private final int Y = 5;
    private final int W = 6;
    
    public RubiksCube(){  
       int [][] botFace;
       th
        frontFace = new int[][]{{R,R,R,},{R,R,R,},{R,R,R,}};
        backFace = new int[][]{{O,O,O,},{O,O,O,},{O,O,O,}};
        leftFace = new int[][]{{B,B,B,},{B,B,B,},{B,B,B,}};
        rightFace = new int[][]{{G,G,G,},{G,G,G,},{G,G,G,}};
        botFace = new int[][]{{W,W,W,},{W,W,W,},{W,W,W,}};
        topFace = new int[][]{{Y,Y,Y},{Y,Y,Y,},{Y,Y,Y,}};      
    }
    
    public RubiksCube(boolean shuffleTest){
        frontFace = new int[][]{{B,B,B,},{B,R,Y,},{W,Y,Y,}};
        backFace = new int[][]{{W,G,Y,},{W,O,W},{W,O,R,}};
        leftFace = new int[][]{{O,R,R,},{B,B,R,},{O,G,G,}};
        rightFace = new int[][]{{Y,R,G,},{B,G,O,},{O,O,R,}};
        botFace = new int[][]{{R,R,G,},{W,W,Y,},{B,Y,G,}};
        topFace = new int[][]{{G,G,Y},{G,Y,W,},{W,O,O,}};    
    }
    
    public void rFaceTurn(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3];
        for(int c = 2; c < frontFace.length; c++){
            for(int r = 0; r < frontFace[0].length; r++){
                proxy[r] = frontFace[r][c];
                frontFace[r][c] = botFace[r][c];
            }
        }
        for(int c = 2; c < topFace.length; c++){
            for(int r = 0; r < topFace[0].length; r++){
                proxy2[r] = topFace[r][c];
                topFace[r][c] = proxy[r];
            }
        }
        for(int c = 2; c < backFace.length; c++){
            for(int r = 0; r < backFace[0].length; r++){
                proxy3[r] = backFace[r][c];
                backFace[r][c] = proxy2[r];
            }
        }
        for(int c = 2; c < botFace.length; c++){
            for(int r = 0; r < botFace[0].length; r++){
                botFace[r][c] = proxy3[r];
            }
        }
        rClockwise(rightFace);
        System.out.println("R");
    }

    public void rFaceTurnQ(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3];
        for(int c = 2; c < frontFace.length; c++){
            for(int r = 0; r < frontFace[0].length; r++){
                proxy[r] = frontFace[r][c];
                frontFace[r][c] = botFace[r][c];
            }
        }
        for(int c = 2; c < topFace.length; c++){
            for(int r = 0; r < topFace[0].length; r++){
                proxy2[r] = topFace[r][c];
                topFace[r][c] = proxy[r];
            }
        }
        for(int c = 2; c < backFace.length; c++){
            for(int r = 0; r < backFace[0].length; r++){
                proxy3[r] = backFace[r][c];
                backFace[r][c] = proxy2[r];
            }
        }
        for(int c = 2; c < botFace.length; c++){
            for(int r = 0; r < botFace[0].length; r++){
                botFace[r][c] = proxy3[r];
            }
        }
        rClockwise(rightFace);
    }    
    
    public void rFaceTurnP(){
        for(int i = 0; i < 3; i++){this.rFaceTurnQ();}
        System.out.println("r");
    }
    
    public void lFaceTurnP(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3];
        for(int c = 0; c < frontFace.length; c++){
            for(int r = 0; r < frontFace[0].length; r++){
                proxy[r] = frontFace[r][c];
                frontFace[r][c] = botFace[r][c];
            }
            break;
        }
        for(int c = 0; c < topFace.length; c++){
            for(int r = 0; r < topFace[0].length; r++){
                proxy2[r] = topFace[r][c];
                topFace[r][c] = proxy[r];
            }
            break;
        }
        for(int c = 0; c < backFace.length; c++){
            for(int r = 0; r < backFace[0].length; r++){
                proxy3[r] = backFace[r][c];
                backFace[r][c] = proxy2[r];
            }
            break;
        }
        for(int c = 0; c < botFace.length; c++){ 
            for(int r = 0; r < botFace[0].length; r++){
                botFace[r][c] = proxy3[r];
            }
            break;
        }
        rCounterClockwise(leftFace);
        System.out.println("l");
    }
  
    public void lFaceTurnPQ(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3];
        for(int c = 0; c < frontFace.length; c++){
            for(int r = 0; r < frontFace[0].length; r++){
                proxy[r] = frontFace[r][c];
                frontFace[r][c] = botFace[r][c];
            }
            break;
        }
        for(int c = 0; c < topFace.length; c++){
            for(int r = 0; r < topFace[0].length; r++){
                proxy2[r] = topFace[r][c];
                topFace[r][c] = proxy[r];
            }
            break;
        }
        for(int c = 0; c < backFace.length; c++){
            for(int r = 0; r < backFace[0].length; r++){
                proxy3[r] = backFace[r][c];
                backFace[r][c] = proxy2[r];
            }
            break;
        }
        for(int c = 0; c < botFace.length; c++){ 
            for(int r = 0; r < botFace[0].length; r++){
                botFace[r][c] = proxy3[r];
            }
            break;
        }
        rCounterClockwise(leftFace);
    }    
    
    public void lFaceTurn(){
        for(int i = 0; i < 3; i++){this.lFaceTurnPQ();}
        System.out.println("L");
    }
    
    public void tFaceTurn(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3];       
        for(int c = 0; c < frontFace.length; c++){
            proxy[c]=frontFace[0][c];
            frontFace[0][c] = rightFace[0][c];            
        }
        for(int c = 0; c < leftFace.length; c++){
            proxy2[c]=leftFace[0][c];
            leftFace[0][c] = proxy[c];           
        }
        for(int c = 0; c < backFace.length; c++){
            proxy3[c]=backFace[2][2-c];
            backFace[2][2-c] = proxy2[c];            
        }
        for(int c = 0; c < rightFace.length; c++){
            rightFace[0][c]=proxy3[c];           
        }
        rClockwise(topFace);
        System.out.println("T");
    }
    
    public void tFaceTurnQ(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3];       
        for(int c = 0; c < frontFace.length; c++){
            proxy[c]=frontFace[0][c];
            frontFace[0][c] = rightFace[0][c];            
        }
        for(int c = 0; c < leftFace.length; c++){
            proxy2[c]=leftFace[0][c];
            leftFace[0][c] = proxy[c];           
        }
        for(int c = 0; c < backFace.length; c++){
            proxy3[c]=backFace[2][2-c];
            backFace[2][2-c] = proxy2[c];            
        }
        for(int c = 0; c < rightFace.length; c++){
            rightFace[0][c]=proxy3[c];           
        }
        rClockwise(topFace);
    }    
    
    public void tFaceTurnP(){
        for(int i = 0; i < 3; i++){
            this.tFaceTurnQ();
        }
        System.out.println("t");
    }
    
    public void botFaceTurnP(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3];       
        for(int c = 0; c < frontFace.length; c++){
            proxy[c]=frontFace[2][c];
            frontFace[2][c] = rightFace[2][c];            
        }
        for(int c = 0; c < leftFace.length; c++){
            proxy2[c]=leftFace[2][c];
            leftFace[2][c] = proxy[c];           
        }
        for(int c = 0; c < backFace.length; c++){
            proxy3[c]=backFace[0][2-c];
            backFace[0][2-c] = proxy2[c];            
        }
        for(int c = 0; c < rightFace.length; c++){
            rightFace[2][c]=proxy3[c];           
        }
        rCounterClockwise(botFace);
        System.out.println("bot");
    }
 
    public void botFaceTurnPQ(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3];       
        for(int c = 0; c < frontFace.length; c++){
            proxy[c]=frontFace[2][c];
            frontFace[2][c] = rightFace[2][c];            
        }
        for(int c = 0; c < leftFace.length; c++){
            proxy2[c]=leftFace[2][c];
            leftFace[2][c] = proxy[c];           
        }
        for(int c = 0; c < backFace.length; c++){
            proxy3[c]=backFace[0][2-c];
            backFace[0][2-c] = proxy2[c];            
        }
        for(int c = 0; c < rightFace.length; c++){
            rightFace[2][c]=proxy3[c];           
        }
        
        rCounterClockwise(botFace);
    }    
    
    public void botFaceTurn(){
        for(int i =0; i < 3; i++){this.botFaceTurnPQ();}
        System.out.println("BOT");
    }
    
        public void fFaceTurn(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3];       
        for(int r = 0; r < rightFace.length; r++){
            proxy[r]=rightFace[r][0];
            rightFace[r][0] = topFace[2][r]; 
        }
        for(int c = 0; c < botFace.length; c++){
            proxy2[c]=botFace[0][c];
            botFace[0][c] = proxy[2-c];
        }
        for(int r = 0; r < leftFace.length; r++){
            proxy3[r]=leftFace[r][2];
            leftFace[r][2] = proxy2[r];            
        }
        for(int c = 0; c < topFace.length; c++){
            topFace[2][c]=proxy3[2-c];           
        }
        rClockwise(frontFace);
        System.out.println("F");
    }
    
        public void fFaceTurnQ(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3];       
        for(int r = 0; r < rightFace.length; r++){
            proxy[r]=rightFace[r][0];
            rightFace[r][0] = topFace[2][r]; 
        }
        for(int c = 0; c < botFace.length; c++){
            proxy2[c]=botFace[0][c];
            botFace[0][c] = proxy[2-c];
        }
        for(int r = 0; r < leftFace.length; r++){
            proxy3[r]=leftFace[r][2];
            leftFace[r][2] = proxy2[r];            
        }
        for(int c = 0; c < topFace.length; c++){
            topFace[2][c]=proxy3[2-c];           
        }
        rClockwise(frontFace); 
    }    
    
    public void fFaceTurnP(){
        for(int i = 0; i < 3; i++){
            this.fFaceTurnQ();
        }
        System.out.println("f");
    }
    
        public void backFaceTurnP(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3]; 
        int [][] dH = copyPaste(rightFace);
        for(int r = 0; r < rightFace.length; r++){        
            proxy[r]=dH[2-r][2];
            rightFace[r][2] = topFace[0][r];            
        }
        for(int c = 0; c < botFace.length; c++){
            proxy2[c]=botFace[2][c];
            botFace[2][c] = proxy[c];           
        }
        for(int r = 0; r < leftFace.length; r++){
            proxy3[r]=leftFace[r][0];
            leftFace[r][0] = proxy2[r];            
        }
        for(int c = 0; c < topFace.length; c++){
            topFace[0][c]=proxy3[2-c];           
        }
        rCounterClockwise(backFace);  
        System.out.println("back");
    } 
    
        public void backFaceTurnPQ(){
        int [] proxy = new int[3];
        int [] proxy2 = new int[3];
        int [] proxy3 = new int[3]; 
        int [][] dH = copyPaste(rightFace);
        for(int r = 0; r < rightFace.length; r++){        
            proxy[r]=dH[2-r][2];
            rightFace[r][2] = topFace[0][r];            
        }
        for(int c = 0; c < botFace.length; c++){
            proxy2[c]=botFace[2][c];
            botFace[2][c] = proxy[c];           
        }
        for(int r = 0; r < leftFace.length; r++){
            proxy3[r]=leftFace[r][0];
            leftFace[r][0] = proxy2[r];            
        }
        for(int c = 0; c < topFace.length; c++){
            topFace[0][c]=proxy3[2-c];           
        }
        rCounterClockwise(backFace);  
    }    
    
    public void backFaceTurn(){
        for(int i = 0; i < 3; i++){this.backFaceTurnPQ();} 
        System.out.println("BACK");
    }
    
        public void flipCube(){
        for(int i = 0; i< 2; i++){
            int [][]prox = copyPaste(topFace); 
            topFace = copyPaste(frontFace);
            int[][]prox1 = copyPaste(backFace);
            backFace = prox; //top face
            prox = copyPaste(botFace);
            botFace = prox1;//back face
            frontFace = prox;//bot face
            rClockwise(leftFace);
            rClockwise(rightFace);
            System.out.println("fCube");
        }        
    }
        
    public void rotateR(){
        int [][] proxy1 = copyPaste(leftFace);
        int[][] proxy2 = copyPaste(backFace);
        int[][] proxy3 = copyPaste(rightFace); //lol
        
        //fix top and bot rotate top clockwise rotate bot clockwise
        rClockwise(topFace);
        rCounterClockwise(botFace);
        leftFace = copyPaste(frontFace);//good
        
        backFace = proxy1; //good so far
        
        rClockwise(backFace);
        rClockwise(backFace);
        
        rightFace = proxy2; //fix rotate colors clockwise
        rCounterClockwise(rightFace);
        rCounterClockwise(rightFace);
        System.out.println("rotateR");
        frontFace = proxy3;//good
    }
    
    private void rotateRQ(){
        int [][] proxy1 = copyPaste(leftFace);
        int[][] proxy2 = copyPaste(backFace);
        int[][] proxy3 = copyPaste(rightFace); //lol
        
        //fix top and bot rotate top clockwise rotate bot clockwise
        rClockwise(topFace);
        rCounterClockwise(botFace);
        leftFace = copyPaste(frontFace);//good
        
        backFace = proxy1; //good so far
        
        rClockwise(backFace);
        rClockwise(backFace);
        
        rightFace = proxy2; //fix rotate colors clockwise
        rCounterClockwise(rightFace);
        rCounterClockwise(rightFace);
        frontFace = proxy3;//good
    }    
    
    private void r180(int[][]face){
        rClockwise(face);
        rClockwise(face);
    }
    
    public void rotateL(){
        for(int i = 0; i < 3; i++){
            this.rotateRQ();
        }
        System.out.println("rotate L");
    }
           
    private void rClockwise(int [][] face){
        int prox = face[0][2]; 
        face[0][2] = face[0][0];
        
        int prox1 = face[2][2];
        face[2][2] = prox;
        
        prox = face[2][0];
        face[2][0] = prox1;
        
        face[0][0] = prox;
   
        prox = face[1][2];
        face[1][2] = face[0][1];
        
        prox1 = face[2][1];
        face[2][1] = prox;
        
        prox = face[1][0];
        face[1][0] = prox1;
        
        face[0][1] = prox;
    }
    
    private void rCounterClockwise(int[][]face){
        for(int i = 0; i < 3; i++){
            rClockwise(face);
        }
    }
    
    private int[][] copyPaste(int [][]copy){
        int [][] paste = new int[3][3];
        for(int r = 0; r < copy.length; r++){
            for(int c = 0; c < copy[0].length; c++){
                paste[r][c] = copy[r][c];
            }
        }
        return paste;
    }
    
    public void printCube(){
        for(int r = 0; r < topFace.length; r++){
            System.out.print("      ");
            for(int c = 0; c < topFace[0].length; c++){
                System.out.print(findSymbol(topFace[r][c]) + " ");       
            }
            System.out.println();
        }
        for(int r = 0; r < leftFace.length; r++){
            for(int c = 0; c < leftFace[0].length + frontFace[0].length + rightFace[0].length; c++){
                if(c <= 2){
                    System.out.print(findSymbol(leftFace[r][c]) + " "); 
                }
                else if(c >= 3 && c < 6){
                    System.out.print(findSymbol(frontFace[r][c-3]) + " ");
                }else{
                    System.out.print(findSymbol(rightFace[r][c-6]) + " ");
                }
            }
            System.out.println();
        }
        
        for(int r = 0; r < botFace.length; r++){
            System.out.print("      ");
            for(int c = 0; c < botFace[0].length; c++){
                System.out.print(findSymbol(botFace[r][c]) + " ");       
            }
            System.out.println();
        }
        for(int r = 0; r < backFace.length; r++){
            System.out.print("      ");
            for(int c = 0; c < backFace[0].length; c++){
                System.out.print(findSymbol(backFace[r][c]) + " ");       
            }
            System.out.println();
        } 
        System.out.println("-------------------");
    } 
    
        private char findSymbol(int color){
        if(color == R){
            return 'r';
        }else if(color == B){
            return 'b';
        }else if(color == G){
            return 'g';
        }else if(color == O){
            return 'o';
        }else if(color == Y){
            return 'y';
        }else{
            return 'w';
        }
    }
    
    public void shuffleCube(){
        ArrayList <String> moveOrder = new ArrayList<String>();
        for(int i = 0; i < 20; i++){
            int randNum = (int)(Math.random() * 6);
            if(randNum == 0){
                this.fFaceTurn();
                System.out.println("front face turn");
                moveOrder.add("front face");
                this.printCube();
            }else if(randNum == 1){
                this.backFaceTurn();
                System.out.println("back face turn");
                moveOrder.add("back face");
                this.printCube();
            }else if(randNum == 2){
                this.rFaceTurn();
                System.out.println("right face turn");
                moveOrder.add("right face");
                this.printCube();
            }else if(randNum == 3){
                this.lFaceTurn();
                System.out.println("left face turn");
                moveOrder.add("left face");
                this.printCube();
            }else if(randNum == 4){
                this.tFaceTurn();
                System.out.println("top face turn");
                moveOrder.add("top face");
                this.printCube();
            }else if(randNum == 5){
                this.botFaceTurn();
                System.out.println("bot face turn");
                moveOrder.add("bot face");
                this.printCube();
            }
        }
        for(int j = 0; j < moveOrder.size(); j++){
            System.out.println(moveOrder.get(j));
        }        
    } 
    
    //solve cube

    public void putWhiteTopV2(){
        for(int i = 0; i < 20; i++){
            int position = 0;
                if(chooseSideD(i)[0][1] == W){
                //System.out.println("1wed");
                pWhiteTop(i,1);
                i = 1;
                }else if(chooseSideD(i)[1][0] == W){
                //System.out.println("2wed");
                    pWhiteTop(i,2);
                    i = 1;
            }else if(chooseSideD(i)[1][2] == W){
                //System.out.println("3wed");
                pWhiteTop(i,3);
                i = 1;
            }else if(frontFace[2][1] == W){
                position = 1;
            }        
            if(position == 1){
                this.lFaceTurn();
                System.out.println("1aa");
                while(topFace[2][1] == W){
                    this.tFaceTurn();
                }
                this.fFaceTurn();
            }else if(position == 2){
                System.out.println("2aa");
                while(topFace[0][1] == W){
                    this.tFaceTurn();
                }
                this.backFaceTurnP();
            }else if(position == 3){
                System.out.println("3aa");
                while(topFace[2][1] == W){
                    this.tFaceTurn();
                }
                this.fFaceTurn();
            }else if(position == 4){
                System.out.println("4aa");
                while(topFace[2][1] == W){
                    this.tFaceTurn();
                }
                this.lFaceTurnP();
                this.fFaceTurn();
                this.lFaceTurn();
            } 
            this.rotateL();
        }
    }    
    
    public void makeDaisy(){
        int edgeC = 0;
        for(int j = 0; j < 10; j++){
            for(int i = 1; i < 7; i++){
                if(chooseSideD(i)[0][1] == W){
                    //System.out.println("1wed");
                    pWhiteTop(i,1);
                    edgeC++;
                    i = 1;
                }else if(chooseSideD(i)[1][0] == W){
                    //System.out.println("2wed");
                    pWhiteTop(i,2);
                    edgeC++;
                    i = 1;
                }else if(chooseSideD(i)[1][2] == W){
                    //System.out.println("3wed");
                    pWhiteTop(i,3);
                    edgeC++;
                    i = 1;
                }else if(chooseSideD(i)[2][1] == W){
                    //System.out.println("4wed");
                    pWhiteTop(i,4);
                    edgeC++;
                    i = 1;
                }
            }
        }
    }
    
    private void pWhiteTop(int side, int position){
        if(side == 2){
            if(position == 1){
                this.lFaceTurn();
                while(topFace[2][1] == W){
                    this.tFaceTurn();
                }
                this.fFaceTurn();
            }else if(position == 2){
                while(topFace[0][1] == W){
                    this.tFaceTurn();
                }
                this.backFaceTurnP();
            }else if(position == 3){
                while(topFace[2][1] == W){
                    this.tFaceTurn();
                }
                this.fFaceTurn();
            }else if(position == 4){
                while(topFace[2][1] == W){
                    this.tFaceTurn();
                }
                this.lFaceTurnP();
                this.fFaceTurn();
                this.lFaceTurn();
            }
            this.printCube();
        }else if(side == 1){
            if(position == 1){
                this.fFaceTurnP();
                while(topFace[1][0] == W){
                    this.tFaceTurn();
                }
                this.lFaceTurnP();
            }else if(position == 2){
                while(topFace[1][0] == W){
                    this.tFaceTurn();
                }
                this.lFaceTurnP();
            }else if(position == 3){
                while(topFace[1][2] == W){
                    this.tFaceTurn();
                }
                this.rFaceTurn();
            }else if(position == 4){
                while(topFace[2][1] == W){
                    this.tFaceTurn();
                }
                this.fFaceTurnP();
                while(topFace[1][2] == W){
                    this.tFaceTurn();
                }
                this.rFaceTurn();
            }
            this.printCube();
            
        }else if(side == 3){
            if(position == 1){
                System.out.println("1cc");
                this.rFaceTurn();
                while(topFace[2][1] == W){this.tFaceTurn();}
                this.fFaceTurnP();
            }else if(position == 2){
                while(topFace[2][1] == W){this.tFaceTurn();}
                this.fFaceTurnP();
            }else if(position == 3){
                while(topFace[0][1] == W){this.tFaceTurn();}
                this.backFaceTurn();
            }else if(position == 4){
                while(topFace[1][2] == W){this.tFaceTurn();}
                this.rFaceTurn();
                while(topFace[2][1] == W){this.tFaceTurn();}
                this.fFaceTurnP();
            }
            this.printCube();
        }else if(side == 4){
            if(position == 1){
                while(topFace[0][1] == W){
                    this.tFaceTurn();
                }
                this.backFaceTurnP();
                while(topFace[1][0] == W){
                    this.tFaceTurn();
                }
                this.lFaceTurn();
            }else if(position == 2){
                while(topFace[1][0] == W){
                    this.tFaceTurn();
                }
                this.lFaceTurn();
            }else if(position == 3){
                while(topFace[1][2] == W){
                    this.tFaceTurn();
                }
                this.rFaceTurnP();
            }else if(position == 4){
                while(topFace[0][1] == W){
                    this.tFaceTurn();
                }
                this.backFaceTurnP();
                while(topFace[1][2] == W){
                    this.tFaceTurn();
                }
                this.rFaceTurnP();                
            }
            this.printCube();
        }else if(side == 5){
            if(position == 1){
                while(topFace[2][1] == W){this.tFaceTurn();}
                this.fFaceTurn();
                this.fFaceTurn();
            }else if(position == 2){
                while(topFace[1][0] == W){this.tFaceTurn();}
                this.lFaceTurn();
                this.lFaceTurn();
            }else if(position == 3){
                while(topFace[1][2] == W){this.tFaceTurn();}
                this.rFaceTurn();
                this.rFaceTurn();            
            }else if(position == 4){
                while(topFace[0][1] == W){this.tFaceTurn();}
                this.backFaceTurn();
                this.backFaceTurn();
            }
            this.printCube();
        }
    }    
    private int[][] chooseSideD(int side){
        if(side == 1){
            return frontFace;
        }else if(side == 2){
            return leftFace;
        }else if(side == 3){
            return rightFace;
        }else if(side == 4){
            return backFace;
        }else{
            return botFace;
        }
    }
    public void moveWhiteDown(){
        System.out.print("Start");
        while(frontFace[0][1] != R ||  topFace[2][1] != W){
            this.tFaceTurn();
        }
        this.fFaceTurn();
        this.fFaceTurn();
        this.printCube();
        while(leftFace[0][1] != B ||  topFace[1][0] != W){
            this.tFaceTurn();
        }
        this.lFaceTurn();
        this.lFaceTurn();
        this.printCube();
        while(rightFace[0][1] != G || topFace[1][2] != W){
            this.tFaceTurn();
        }
        this.rFaceTurn();
        this.rFaceTurn();
        this.printCube();
        while(backFace[2][1] != O || topFace[0][1] != W){
            System.out.println(backFace[2][1] != O);
            this.tFaceTurn();
            this.printCube();
            System.out.println(backFace[2][1] != O);
        }  
        
        System.out.println(topFace[0][1] != W);
        this.backFaceTurn();
        this.backFaceTurn();
        this.printCube();
    }
    
    /** 
     * blue : red corner == 1
     * blue : orange corner == 2
     * green : red corner == 3;
     * green : orange corner == 4;
    */       
    public void insertCorners(){
        int cCount = 0;
        ArrayList <Integer> CornersSolv = new ArrayList<Integer>(); 
        int looped = 0;
        //corner top left
        while(cCount < 8){
            looped++;
            if(topFace[2][0] == W){
                int corner = findCorner(frontFace[0][0],leftFace[0][2]);
                
                if(frontFace[0][0] == frontFace[1][1]){
                    if(!find(CornersSolv,corner)){
                        CornersSolv.add(corner);
                        cCount++;
                    }
                }else{
                    //this.printCube();
                    CornersSolv.add(corner);
                    this.lFaceTurn();
                    this.botFaceTurn();
                    this.lFaceTurnP();
                    this.botFaceTurnP();
                    matchColorInsertL();
                    //del aft
                    //put corner down
                    //insert corner up
                }
                this.printCube();
            }
            
            //corner top right
            if(topFace[2][2] == W){
                int corner = findCorner(frontFace[0][2],rightFace[0][0]);
                
                if(frontFace[0][2] == frontFace[1][1]){
                    if(!find(CornersSolv,corner)){
                        CornersSolv.add(corner);
                        cCount++;
                    }                    
                }else{
                    this.printCube();
                    CornersSolv.add(corner);  
                    this.rFaceTurnP();
                    this.botFaceTurnP();
                    this.rFaceTurn();
                    this.botFaceTurn();
                    matchColorInsertR();
                    //put corner down
                    //insert corner up
                }
                this.printCube();
            }
        
            //corner front face top left
            if(frontFace[0][0] == W){
                int corner = findCorner(topFace[2][0], leftFace[0][2]);
                CornersSolv.add(corner);
                
                cCount++;
                
                this.fFaceTurnP();
                this.botFaceTurnP();
                this.fFaceTurn();
                this.botFaceTurn();
                matchColorInsertL();
                //move corner down
                //insert corner
                this.printCube();
            }
        
            //corner front face top right
            if(frontFace[0][2] == W){
                int corner = findCorner(topFace[2][2], rightFace[0][0]);
                CornersSolv.add(corner);
 
                cCount++;               
                
                this.fFaceTurn();
                this.botFaceTurn();
                this.fFaceTurnP();
                this.botFaceTurnP();
                matchColorInsertR();                
                //move corner down
                //insert corner
                this.printCube();
            }
        
            //corner front face bot left
            if(frontFace[2][0] == W){
                int corner = findCorner(leftFace[2][2], botFace[0][0]);
                CornersSolv.add(corner);

                cCount++;
                
                matchColorInsertL();
                //insert corner 
                this.printCube();
            }
        
            //corner front face bot right
            if(frontFace[2][2] == W){
                int corner = findCorner(rightFace[2][0], botFace[0][2]);
                CornersSolv.add(corner);

                cCount++;
                
                matchColorInsertR();
                //insert corner

                this.printCube();
            }
        
            //corner bot left
            if(botFace[0][0] == W){
                int corner = findCorner(frontFace[2][0], leftFace[2][2]);
                CornersSolv.add(corner);
 
                cCount++;
                
                while(topFace[2][0] == W){
                    this.botFaceTurnP();
                    this.rotateL();
                }
                this.lFaceTurn();
                this.botFaceTurnP();
                this.lFaceTurnP();
                this.botFaceTurnP();
                matchColorInsertR();
                //flip piece up
                //insert corner
                this.printCube();
            }
        
            //corner bot right
            if(botFace[0][2] == W){
                int corner = findCorner(frontFace[2][2], rightFace[2][0]);
                CornersSolv.add(corner);
                
                cCount++;
                
                while(topFace[2][2] == W){
                    this.botFaceTurn();
                    this.rotateR();
                }
                this.rFaceTurnP();
                this.botFaceTurn();
                this.rFaceTurn();
                this.botFaceTurn();
                matchColorInsertL();
                //face piece up
                //insert corner
                this.printCube();
            }
            
            if(topFace[0][0] == W && topFace[0][2] == W && topFace[2][0] == W && 
            topFace[2][2] == W && CornersSolv.size() >= 4){
                break;
            }
            
            this.rotateR();
            if(looped > 20){
                System.out.println("infinite loop");
                break;
            }
        }
        for(int i = 0; i < CornersSolv.size(); i++){
            System.out.print(" "+CornersSolv.get(i));
        }
        System.out.println();
    }
    
    private void matchColorInsertL(){
        while(leftFace[2][2] != leftFace[1][1]){
            this.botFaceTurnP();
            this.rotateL();
        }
        this.botFaceTurn();
        this.lFaceTurn();
        this.botFaceTurnP();
        this.lFaceTurnP();
    }
    
    private void matchColorInsertR(){
        while(rightFace[2][0] != rightFace[1][1]){
            this.botFaceTurn();
            this.rotateR();
        }
        this.botFaceTurnP();
        this.rFaceTurnP();
        this.botFaceTurn();
        this.rFaceTurn();
    }
    
    /** 
     * blue : red corner == 1
     * blue : orange corner == 2
     * green : red corner == 3;
     * green : orange corner == 4;
    */    
    private int findCorner(int fColor, int sColor){
        if(fColor == R && sColor == B){
            return 1;
        }else if(fColor == B && sColor == R){
            return 1;
        }else if(fColor == B && sColor == O){
            return 2;
        }else if(fColor == O && sColor == B){
            return 2;
        }else if(fColor == G && sColor == R){
            return 3;
        }else if(fColor == R && sColor == G){
            return 3;
        }else if(fColor ==  O && sColor == G){
            return 4;
        }else if(fColor == G && sColor == O){
            return 4;
        }
        return -1;
    }
    
    private boolean find(ArrayList<Integer> arr, int num){
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == num){
                return true;
            }
        }
        return false;
    }
    
    public void insertEdges(){
        boolean finished = false;
        while(!finished){
            
        if(frontFace[1][0] == frontFace[1][1]&&leftFace[1][2] == leftFace[1][1]){
            if(frontFace[1][2] == frontFace[1][1]&&rightFace[1][0] == rightFace[1][1]){
                if(backFace[1][0] == backFace[1][1]&&leftFace[1][0] == leftFace[1][1]){
                    if(backFace[1][2] == backFace[1][1]&&rightFace[1][2]==rightFace[1][1]){
                        System.out.println("REEEEEEEEE");
                        break;
                    }
                }
            }
        }            
        boolean insertable = canInsertE(frontFace[0][1],topFace[2][1]);    
        int looped = 0;
        while(!insertable){
            if(looped == 4){
                break;
            }
            System.out.println("start");
            this.tFaceTurn();
            insertable = canInsertE(frontFace[0][1],topFace[2][1]);
            System.out.println(insertable);
            this.printCube();
            looped++;
        }
        
        if(!insertable){
            putEdgeUp();
            //i--;
            continue;
        } 
        
        System.out.println(frontFace[0][1] +" "+ topFace[2][1]);
        System.out.println("insertable: " + insertable);
        
        for(int j = 0; j < 4; j++){
            this.tFaceTurn();
            this.rotateL();            
            if(frontFace[0][1] == frontFace[1][1]){
                System.out.println("break");
                this.printCube();
                break;
            }
            this.printCube();
        } 
        
        if(topFace[2][1] == leftFace[1][1]){
            System.out.println("move left");
            insertLeftM();
        }else if(topFace[2][1] == rightFace[1][1]){
            System.out.println("move right");
            insertRightM();
        }
        this.printCube();
        }
        boolean ins = canInsertE(B,Y);
        System.out.println(ins);
    }
    
    private void putEdgeUp(){
        System.out.println("flip piece");
        boolean inserted = false;
        this.printCube();
        if(canInsertE(frontFace[0][1],leftFace[1][2]) && frontFace[0][1] != frontFace[1][1]){
            for(int i = 0; i < 4;i++){
                if(topFace[2][1] != Y){
                    break;
                }else if(frontFace[0][1] != Y){
                    break;
                }
            }
            insertLeftM();
            inserted = true;
        }else if(canInsertE(frontFace[1][2], rightFace[0][1]) && frontFace[1][2] != frontFace[1][1]){
            for(int i = 0; i < 4;i++){
                if(topFace[2][1] != Y){
                    break;
                }else if(frontFace[0][1] != Y){
                    break;
                }
            }
            insertRightM();
            inserted = true;
        }
        if(!inserted){
            this.rotateL();
            this.rotateL();
            this.printCube();
            //while(topFace[2][1] != Y){this.tFaceTurn();}
            for(int i = 0; i < 4;i++){
                if(topFace[2][1] != Y){
                    break;
                }else if(frontFace[0][1] != Y){
                    break;
                }
            }
            System.out.println( frontFace[0][1] +" "+ frontFace[1][1]);
            if(canInsertE(frontFace[1][0],leftFace[1][2]) && frontFace[1][0] != frontFace[1][1]){
                insertLeftM();
            }else if(canInsertE(frontFace[1][2], rightFace[1][0]) && frontFace[1][2] != frontFace[1][1]){
                insertRightM();
            }
        }
    }
    
    private void insertRightM(){
        this.tFaceTurn();
        this.rFaceTurn();
        this.tFaceTurnP();
        this.rFaceTurnP();
        this.tFaceTurnP();
        this.fFaceTurnP();
        this.tFaceTurn();
        this.fFaceTurn();
    }
    
    private void insertLeftM(){
        this.tFaceTurnP();
        this.lFaceTurnP();
        this.tFaceTurn();
        this.lFaceTurn();
        this.tFaceTurn();
        this.fFaceTurn();
        this.tFaceTurnP();
        this.fFaceTurnP();
    }    
    
    private boolean canInsertE(int fColor, int sColor){
        if(fColor == Y || sColor == Y){
            return false;
        }
        return true;
    }
    
    public void solveYellowCross(){
        System.out.println("hajime");
        for(int i = 0; i < 4; i++){
        if(topFace[0][1] == Y && topFace[2][1] == Y){
            this.tFaceTurn();          
        }else if(topFace[0][1] == Y && topFace[1][2] == Y){
            this.tFaceTurnP();
        }else if(topFace[1][0] == Y && topFace[2][1] == Y){
            this.tFaceTurn();
        }else if(topFace[1][2] == Y && topFace[2][1] == Y){
            this.tFaceTurn();
            this.tFaceTurn();
        }
        executeOll();
        this.printCube();
        if(cross()){
            break;
        }
        }
    }
    
    private boolean cross(){
        if(topFace[0][1] == Y && topFace[1][0] == Y && topFace[1][2] == Y &&
        topFace[2][1] == Y){
            return true;
        }
        return false;
    }
    
    private void executeOll(){
        fFaceTurn();
        tFaceTurn();
        rFaceTurn();
        tFaceTurnP();
        rFaceTurnP();
        fFaceTurnP();
    }
    
    public void solveYellCorners(){
        for(int i = 0; i < 3; i++){
            this.printCube();
            int corners = checkCorners();
            if(corners == 2){
                System.out.println("case 2");
                while(frontFace[0][0] != Y){
                    this.tFaceTurn();
                    this.printCube();
                }
                executeOll2();
            }else if(corners == 0){
                System.out.println("case 1");
                while(leftFace[0][2] != Y){
                    this.tFaceTurn();
                    this.printCube();
                }
                executeOll2();
            }
            int checkFish = checkFish();
            if(checkFish == 1){
                this.tFaceTurnP(); 
                executeOll2();
            }else if(checkFish == 2){
                this.tFaceTurn();
                tFaceTurn();
                executeOll2();
            }else if(checkFish == 3){
                executeOll2();
            }else if(checkFish == 4){
                this.tFaceTurn();
                executeOll2();
            }
            this.printCube();
            if(checkTop()){
                break;
            }
        }
    }
    
    private void executeOll2(){
        rFaceTurn();
        tFaceTurn();
        rFaceTurnP();
        tFaceTurn();
        rFaceTurn();
        tFaceTurn();
        tFaceTurn();
        rFaceTurnP();
    }
    
    private boolean checkTop(){
        for(int r = 0; r < topFace.length;r++){
            for(int c = 0; c < topFace[0].length;c++){
                if(topFace[r][c] != Y){
                    return false;
                }
            }
        }
        return true;
    }
    
    private int checkCorners(){
        int corners = 0;
        if(topFace[0][0] == Y){
            corners++;
        }    
        if(topFace[0][2] == Y){
            corners++;
        }     
        if(topFace[2][0] == Y){
            corners++;
        }     
        if(topFace[2][2] == Y){
            corners++;
        }
        return corners;
    }
    
    private int checkFish(){
        if(topFace[0][0] == Y){
            return 1;
        }else if(topFace[0][2] == Y){
            return 2;
        }else if(topFace[2][0] == Y){
            return 3;
        }else if(topFace[2][2] == Y){
            return 4;
        }
        return -1;
    }
    //lol you don't have to orient the corners when executing the first and
    //second oll algos
    public void orientYellCorners(){
        System.out.println("start");
        int matchedFace = 0;
        boolean solved = false;
        
        for(int i = 0; i < 4; i++){        
            if(frontFace[0][0] == frontFace[0][2]){
               matchedFace++; 
            }
            this.tFaceTurn();
            this.printCube(); 
        }  
        
        this.printCube();
        
        if(matchedFace != 4 && matchedFace != 0){
            System.out.println("start1");
            findHeadLights();
            this.printCube();
            executePll();
        }
        
        solved = checkSolved();
        System.out.println(solved);
        
        if(matchedFace == 0 && !solved){
            System.out.println("start1a");
            for(int i = 0; i < 4; i++){
                if(checkDiag()){
                    break;
                }
                this.tFaceTurn();
            }
            executePll();
            this.printCube();
            for(int i = 0; i < 4; i++){
                if(frontFace[0][0] == frontFace[0][2]){
                    break;
                }
            } 
            this.tFaceTurn();
            this.tFaceTurn();
            findHeadLights();
            this.printCube();
            executePll();
        }
        this.printCube();
        
        while(frontFace[0][1] != frontFace[1][1]){
            tFaceTurn();
            rotateL();
            this.printCube();
        }    
        
        solved = checkSolved();
        check();
        System.out.println(solved);
        
        if(!solved){
            System.out.println("start2");
            int noneComplete = 0;
            for(int i = 0; i < 4; i++){
                if(frontFace[0][0] == frontFace[0][1] && frontFace[0][0] == frontFace[0][2]){
                    break;
                }
                this.tFaceTurn();
                this.printCube();
                noneComplete++;
            } 
            if(noneComplete != 4){
                while(frontFace[0][1] != frontFace[1][1]){
                    tFaceTurn();
                    rotateL();
                    this.printCube();
                }
                this.rotateL();
                this.rotateL();
                this.printCube();
                if(frontFace[0][1] == leftFace[1][1]){
                    System.out.println("left");
                    executePllLeft();
                }else{
                    System.out.println("right");
                    executePllRight();
                }
                this.printCube();
            }else{
                System.out.println("bruh");
                while(frontFace[0][0] != frontFace[1][1]){
                    tFaceTurn();
                    this.printCube();
                }
                if(frontFace[0][1] == backFace[1][1]){
                    System.out.println("reeeeee");
                }else{
                    if(frontFace[0][1] == leftFace[1][1]){
                        System.out.println("left");
                        executePllLeft();
                        rotateR();
                        executePllLeft();
                    }else{
                        System.out.println("right");
                        executePllRight();
                        rotateL();
                        executePllRight();
                    }
                    this.printCube(); 
                }
            }
        }else{
            System.out.println("finished");
        }
    }
    
    private boolean checkSolved(){
        for(int r = 0; r < leftFace.length;r++){
            for(int c = 0; c < leftFace[0].length;c++){
                if(leftFace[r][c] != leftFace[1][1]){
                    return false;
                }
            }
        } 
        for(int r = 0; r < rightFace.length;r++){
            for(int c = 0; c < rightFace[0].length;c++){
                if(rightFace[r][c] != rightFace[1][1]){
                    return false;
                }
            }
        }
        for(int r = 0; r < backFace.length;r++){
            for(int c = 0; c < backFace[0].length;c++){
                if(backFace[r][c] != backFace[1][1]){
                    return false;
                }
            }
        }
        for(int r = 0; r < frontFace.length;r++){
            for(int c = 0; c < frontFace[0].length;c++){
                if(frontFace[r][c] != frontFace[1][1]){
                    return false;
                }
            }
        } 
        return true;
    }

    private void check(){
        for(int r = 0; r < leftFace.length;r++){
            boolean b = false;
            for(int c = 0; c < leftFace[0].length;c++){
                if(leftFace[r][c] != leftFace[1][1]){
                    System.out.println(r + " " + c);
                    b = true;
                    break;
                }
            }
            if(b){break;}
        } 
        for(int r = 0; r < rightFace.length;r++){
            boolean b = false;
            for(int c = 0; c < rightFace[0].length;c++){
                if(rightFace[r][c] != rightFace[1][1]){
                    System.out.println(r + " " + c);
                    b = true;
                    break;
                }
            }
            if(b){break;}
        }
        for(int r = 0; r < backFace.length;r++){
            boolean b = false;
            for(int c = 0; c < backFace[0].length;c++){
                if(backFace[r][c] != backFace[1][1]){
                    System.out.println(r + " " + c);
                    b = true;
                    break;
                }
            }
            if(b){break;}
        }
        for(int r = 0; r < frontFace.length;r++){
            boolean b = false;
            for(int c = 0; c < frontFace[0].length;c++){
                if(frontFace[r][c] != frontFace[1][1]){
                    System.out.println(r + " " + c);
                    b = true;
                    break;
                }
            }
            if(b){break;}
        } 
    }    
    
        private boolean checkDiag(){
        if(frontFace[0][0] == B && frontFace[0][2] == G){
            return true;
        }else if(frontFace[0][0] == G && frontFace[0][2] == B){
            return true;
        }
        return false;
    }
    
    private void findHeadLights(){
        if(frontFace[0][0] == frontFace[0][2]){
            this.tFaceTurn();
            this.tFaceTurn();
        }else if(leftFace[0][0] == leftFace[0][2]){
            this.tFaceTurn();
        }else if(rightFace[0][0] == rightFace[0][2]){
            this.tFaceTurnP();
        }
    }
    
        private boolean checkHeadLights(){
        int count = 0;
        if(frontFace[0][0] == frontFace[0][2]){
            count++;
        }
        if(leftFace[0][0] == leftFace[0][2]){
            count++;
        }
        if(rightFace[0][0] == rightFace[0][2]){
            count++;
        }
        if(backFace[2][0] == backFace[2][2]){
            count++;
        }
        if(count == 4){
            return true;
        }
        return false;
    }
    
    private void executePll(){
        this.rFaceTurnP();
        this.fFaceTurn();
        this.rFaceTurnP();
        this.backFaceTurn();
        this.backFaceTurn();
        this.rFaceTurn();
        this.fFaceTurnP();
        this.rFaceTurnP();
        this.backFaceTurn();
        this.backFaceTurn();
        this.rFaceTurn();
        this.rFaceTurn();
    }
    
    private void executePllRight(){
        this.fFaceTurn();
        this.fFaceTurn();
        this.tFaceTurnP();
        this.lFaceTurn();
        this.rFaceTurnP();
        this.fFaceTurn();
        this.fFaceTurn();
        this.lFaceTurnP();
        this.rFaceTurn();
        this.tFaceTurnP();
        this.fFaceTurn();
        this.fFaceTurn();
    }
    
    private void executePllLeft(){
        this.fFaceTurn();
        this.fFaceTurn();
        this.tFaceTurn();
        this.lFaceTurn();
        this.rFaceTurnP();
        this.fFaceTurn();
        this.fFaceTurn();
        this.lFaceTurnP();
        this.rFaceTurn();
        this.tFaceTurn();
        this.fFaceTurn();
        this.fFaceTurn();
    }    
}

