public class Main {

    public static void main(String[] args) {
        GamePiece gamePiece = new GamePiece();
        System.out.println(gamePiece.frozen);
        gamePiece.freeze();
        System.out.println(gamePiece.frozen);
        gamePiece.unfreeze();
        System.out.println(gamePiece.frozen);
        gamePiece.move(5, 5);
        System.out.println(gamePiece.positionX);
        System.out.println(gamePiece.positionY);
        gamePiece.freeze();
        System.out.println(gamePiece.frozen);
        gamePiece.move(6, 6);
        System.out.println(gamePiece.positionX);
        System.out.println(gamePiece.positionY);
    }
}
