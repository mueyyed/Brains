
import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isc
 */
@ManagedBean(name = "home")
public class HomePage {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int main(int args){
        setName("asdasd asd as asd as mueeyed");
        return 0;
    }

}
