import java.io.ObjectInputFilter;

public interface HistoricTask {
    String getAssignee();
    int getId();
    Status getStatus();
}
