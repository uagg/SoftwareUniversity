package CustomExceptions;

public class InvalidSongLengthException extends InvalidSongException {

    public InvalidSongLengthException(String message) {
        super(message);
    }
}
