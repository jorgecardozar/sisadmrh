/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mj.gob.sisadmrh.service;

import java.util.Optional;
import mj.gob.sisadmrh.model.Hijodiscapacidad;
import mj.gob.sisadmrh.repository.HijosdiscapacidadRepository;
import mj.gob.sisadmrh.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author IPalacios
 */
public class HijosdiscapacidadServicesImpl implements HijosdiscapacidadService {
    private HijosdiscapacidadRepository hijosdiscapacidadRep;
    
        @Autowired
    public void setHijosdiscapacidadRepository(HijosdiscapacidadRepository hijosdiscapacidadRepository) {
        this.hijosdiscapacidadRep = hijosdiscapacidadRepository;
    }

    @Override
    public Iterable<Hijodiscapacidad> listAllHijodiscapacidad() {
        return hijosdiscapacidadRep.findAll();
    }

    @Override
    public Optional<Hijodiscapacidad> getHijodiscapacidadById(Integer id) {
         return hijosdiscapacidadRep.findById(id);
    }

    @Override
    public Hijodiscapacidad saveHijodiscapacidad(Hijodiscapacidad hijodiscapacidad) {
        return hijosdiscapacidadRep.save(hijodiscapacidad);
    }

    @Override
    public void deleteHijodiscapacidad(Integer id) {
        hijosdiscapacidadRep.deleteById(id);
    }
    
}
