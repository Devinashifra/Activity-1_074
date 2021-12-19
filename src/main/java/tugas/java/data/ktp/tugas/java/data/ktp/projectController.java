package tugas.java.data.ktp.tugas.java.data.ktp;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author HP
 */

@Controller
public class projectController {
    
    DataKTP data = new DataKTP();
        
    @RequestMapping("/dataktp")
   public String getData(Model model){
       
       ArrayList<String> Data = new ArrayList<>();
       Data = data.getData();
       
       model.addAttribute("DataKTP", Data);
       
       return "view";
   }
}
