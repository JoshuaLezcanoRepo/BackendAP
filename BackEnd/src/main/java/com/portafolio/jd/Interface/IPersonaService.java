package com.portafolio.jd.Interface;

import com.portafolio.jd.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    // Traer Lista de Personas
    public List<Persona> getPersona();
    
    // Guardar Objeto de Tipo Persona
    public void savePersona(Persona persona);
    
    // Eliminar Objeto (Usuario) - Buscado por ID
    public void deletePersona(Long id);
    
    // Buscar Persona por ID
    public Persona findPersona(Long id);
}
