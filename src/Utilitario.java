
public class Utilitario {
	public static int comprimentoChamadaTexto = 144;
	public static int vencimentoRecarga = 90;
	public static float custoChamadaVoz = 2;
	public static float custoChamadaTexto = 2;
	
	public static boolean recarregar(LinhaTelefonica[] linhas, String numero, float valor){
		for(int i = 0; i < linhas.length; i++){
			if(numero.equals(linhas[i].getNumero())){
				if(linhas[i] instanceof Pre){
					((Pre) linhas[i]).recarregar(valor);
					return true;
				}
			}
		}
		return false;
	}
}
