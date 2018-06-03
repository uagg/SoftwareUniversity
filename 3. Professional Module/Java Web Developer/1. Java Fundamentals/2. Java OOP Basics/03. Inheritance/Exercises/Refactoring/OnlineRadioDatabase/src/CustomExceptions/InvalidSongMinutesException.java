package CustomExceptions;

public class InvalidSongMinutesException extends InvalidSongLengthException {

    public InvalidSongMinutesException(String message) {
        super(message);
    }
}
