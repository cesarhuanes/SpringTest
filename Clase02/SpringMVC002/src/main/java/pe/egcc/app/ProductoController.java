package pe.egcc.app;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.egcc.app.model.ProductoBean;

public class ProductoController {
@RequestMapping(value="producto.htm",method=RequestMethod.GET)	
public String prodProducto(){
	
	return "productoInput";
}
@RequestMapping(value="producto.htm",method=RequestMethod.GET)	
public String prodProducto(@ModelAttribute  ProductoBean bean,Model model){
	model.addAttribute("bean",bean);
	return "productoOutPut";
}

}
