package csnam.edu.tdd.models;

/**
 * @project helloworldtdd
 * @user jp
 * @date 2019-03-02
 */
public class Greeting {

  private String name = "";

  public String getName() {
    return name;
  }

  public String getMessage() {
    if (name == "") {
      return "Hello World";
    } else {
      return "Hello " + name;
    }
  }


  public String setName(String name) {
    this.name = name;
    return name;
  }
}
