package meuPacote;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GravadorJson {

    public void getUsuario(String nome, String email, String senha) {

        Usuario usuario = new Usuario(nome, email, senha);

        // Caminho do arquivo JSON
        String caminho = "C:\\Users\\Eduardo\\Documents\\Eduardo_faculdade\\Java\\gradle\\app\\src\\main\\java\\meuPacote\\usuario.json";
        File arquivo = new File(caminho);

        // Criar lista de usuários, se o arquivo não existir, criar uma nova lista
        List<Usuario> usuarios = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();

        if (arquivo.exists() && arquivo.length() > 0) {
            try {
                // Lê os usuários existentes no arquivo
                usuarios = objectMapper.readValue(arquivo, new TypeReference<List<Usuario>>() {});
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Adiciona o novo usuário à lista
        usuarios.add(usuario);

        // Salva novamente o arquivo JSON com a lista de usuários atualizada
        try {
            objectMapper.writeValue(arquivo, usuarios);
            System.out.println("Usuário adicionado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}