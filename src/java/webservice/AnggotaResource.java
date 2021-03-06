/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import model.Anggota;

/**
 * REST Web Service
 *
 * @author Michael Donny Kusuma
 */
@Path("anggota")
public class AnggotaResource {

    

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of AnggotaResource
     */
    public AnggotaResource() {
    }

    /**
     * Retrieves representation of an instance of webservice.AnggotaResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText(@QueryParam("name")String name , @QueryParam("age")String  age ) {
        //TODO return proper representation object
//        Anggota a[] = Anggota.showAnggota();
//        String hasil = null;
//        for (int i = 0; i < a.length; i++) {
//            hasil = hasil + a[i].getUsername() + "\n";
//        }

        String hasil = name + " " + age;
        return hasil;
    }

    /**
     * PUT method for updating or creating an instance of AnggotaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}
