import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringListImplTest {
    private final StringListImpl out = new StringListImpl();

    @Test
    public void ShouldThrowExceptionWhenItemIsNull(){
        Assertions.assertThrows(CanNotAddNullException.class,()-> out.add(null));
    }
    @Test
    public void ShouldAdd(){
        String ONE = "Китай";
        out.add(ONE);
        Assertions.assertEquals(out.get(0),ONE);

    }
}
