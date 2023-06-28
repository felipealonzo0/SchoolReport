package com.reports.base.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

// import com.reports.base.models.UsuarioModel;
// import com.reports.base.repository.UsuarioRepository;

@Service
public class ReportsService {
    // @Autowired

    // UsuarioRepository usuarioRepository;

    // public ArrayList<UsuarioModel> obtenUsuarioModels() {
    //     return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    // }

    // public UsuarioModel guardarUsuario(UsuarioModel usuario) {
    //     return usuarioRepository.save(usuario);
    // }

    // public Boolean deleteById(Long id) {
    //     try {
    //         usuarioRepository.deleteById(id);
    //         return true;
    //     } catch (Exception e) {
    //         return false;
    //     }
    // }

    // public Optional<UsuarioModel> getById(Long idLong){
    //     return usuarioRepository.findById(idLong);
    // }

    // public ArrayList<UsuarioModel> obtenerPorNombre(String nombreString){
    //     return (ArrayList<UsuarioModel>)usuarioRepository.findByNombre(nombreString);
    // }
    
    public List<String> getAllStudents(){
        String url = "http://example.com";
        RestTemplate rt = new RestTemplate();
        List<String> studentsList = rt.getForObject(url, List.class);

        return studentsList;
    }

    public List<String> getAllQualifications(){
        String url = "http://example.com";
        RestTemplate rt = new RestTemplate();
        List<String> qualificationsList = rt.getForObject(url, List.class);

        return qualificationsList;
    }
}