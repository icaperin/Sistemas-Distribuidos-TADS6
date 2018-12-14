package Validar_CPF_CNPJ;

import javax.jws.*;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)

public interface valida_Interface {

   @WebMethod
    boolean isValidCPF(String cpf);

    @WebMethod
    boolean isValidCNPJ(String cnpj);

}
