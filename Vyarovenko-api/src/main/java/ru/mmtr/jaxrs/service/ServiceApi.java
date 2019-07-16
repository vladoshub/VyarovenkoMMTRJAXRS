package ru.mmtr.jaxrs.service;

import ru.mmtr.jaxrs.converter.HumanConverter;
import ru.mmtr.jaxrs.dao.HumanDaoImpl;
import ru.mmtr.jaxrs.dto.HumanDto;
import ru.mmtr.jaxrs.model.Human;


import java.util.List;

public class ServiceApi {

    public ServiceApi(){

    }
    public void addHuman(HumanDto humanDto){

        HumanDaoImpl humanDao = new HumanDaoImpl();
        humanDao.addHuman(HumanConverter.convertToHuman(humanDto));
    }

    public List<HumanDto> getHumans(){
        HumanDaoImpl humanDao = new HumanDaoImpl();
        List<Human> humans = humanDao.getHumans();
        return HumanConverter.convertToHumanDtoList(humans);
    }
}
