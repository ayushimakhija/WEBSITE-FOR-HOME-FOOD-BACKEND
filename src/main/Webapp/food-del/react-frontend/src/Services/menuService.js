import axios from "axios";

class menuService{

    getMenuByDish(dishName){
        return axios.get("http://localhost:8080/api//menu/{dishName}");
    }
    createMenu(menu)
    {
        return axios.post("http://localhost:8080/api/createMenu",menu);
    }
    updateMenu(menu){
        return axios.put("http://localhost:8080/api/updateMenu/{id}",menu);
    }
}
