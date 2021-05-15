import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Cat {

 private Status status;
 private String type;
 private boolean deleted;
 private String _id;
 private String user;
 private String text;
 private Integer __v;
 private String source;
 private String updatedAt;
 private String createdAt;
 private boolean used;

 @Data
 public class Status {
  private boolean verified;
  private Long sentCount;
 }

}


