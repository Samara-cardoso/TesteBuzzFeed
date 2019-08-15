package br.com.princesinha.AutomacaoCasosDeFamilia;

import java.io.File;

public class SalvaPrintTela {
	
	public void criarDiretorioMacro() {
        try {
            File diretorio = new File("C:\\TestesBuzzFeed");
            diretorio.mkdir();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
