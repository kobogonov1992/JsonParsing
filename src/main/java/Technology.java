import lombok.Data;
import lombok.ToString;
import java.util.List;

@Data
@ToString
public class Technology {
    private String product;
    private String init;
    private List <Object> dataseries;

    @Data
    class Dataseries{
        private Integer timepoint;
        private Integer cloudcover;
        private Integer seeing;
        private Integer transparency;
        private Integer lifted_index;
        private Integer rh2m;

        private Wind10m wind10m;

        @Data
        class Wind10m{
            private String direction;
            private Integer speed;
        }
        private Integer temp2m;
        private String prec_type;
    }
}





