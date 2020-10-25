package sk.stefanlevoca.restApi.services.implementations;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sk.stefanlevoca.restApi.model.DataList;
import sk.stefanlevoca.restApi.services.RestApiService;

@Service
public class RestApiServiceImpl implements RestApiService {

    RestTemplate restTemplate;

    public RestApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public DataList getData() {
        DataList dataList = restTemplate.getForObject("http://apifaketory.com/api/user?limit=5",
                DataList.class);
        return dataList;
    }
}


