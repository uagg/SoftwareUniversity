import java.util.List;

public interface ILieutenantGeneral extends IPrivate {

    List<IPrivate> getPrivates();

    void addPrivate(IPrivate p);
}