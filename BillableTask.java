import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "task_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date dueDate;
    private boolean status;


    // Getters and setters
}

@Entity
@DiscriminatorValue("Billable")
public class BillableTask extends Task {
    private double hourlyRate;
    // Getters and setters
}

@Entity
@DiscriminatorValue("Internal")
public class InternalTask extends Task {

    // Getters and setters
}
