package br.edu.ifpb.cg.Armazenamento;
import br.edu.ifpb.cg.Exceptions.HotelExeptions;
import br.edu.ifpb.cg.GeradorId.GeradorId;
import br.edu.ifpb.cg.Negocio.Hotel;

import java.io.*;

public class Armazenamento {

    private String nomeDoArquivo;

    public Armazenamento(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    public Hotel recuperar(GeradorId geradorId) throws HotelExeptions {
        Hotel hotel = null;
        try (FileInputStream fis = new FileInputStream(this.nomeDoArquivo);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            hotel = (Hotel) ois.readObject();
            hotel.setGeradorId(geradorId);
        } catch (FileNotFoundException e) {
            hotel = new Hotel(geradorId);
        } catch (IOException | ClassNotFoundException e ){
            throw new HotelExeptions("Erro na Recuperação");
        }
        return hotel;
    }

    public void armazenar(Hotel hotel) throws HotelExeptions {
        try (FileOutputStream fos = new FileOutputStream(this.nomeDoArquivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(hotel);
        } catch (IOException e) {
            throw new HotelExeptions("Houve um erro ao tentar armazenar os dados do Hotel.", e);
        }
    }

}
