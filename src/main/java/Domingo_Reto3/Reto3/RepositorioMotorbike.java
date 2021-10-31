package Domingo_Reto3.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMotorbike {
    
    @Autowired
    private InterfaceMotorbike crud4;

    public List<Motorbike> getAll(){
        return (List<Motorbike>) crud4.findAll();
    }

    public Optional<Motorbike> getMotorbike(int id){
        return crud4.findById(id);
    }

    public Motorbike save(Motorbike motorbike){
        return crud4.save(motorbike);
    }
    public void delete(Motorbike motorbike){
        crud4.delete(motorbike);
    }
}
