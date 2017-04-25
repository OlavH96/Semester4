package eksempel.KontoRMI;//
// Leksjon 2, katalog KontoRMI
// Konto.java E.L. 2003-09-03
//

import java.rmi.Remote;
import java.rmi.RemoteException;

interface Konto extends Remote {

    long finnKontonr() throws RemoteException;

    String finnNavn() throws RemoteException;

    double finnSaldo() throws RemoteException;

    void gjørTransaksjon(double beløp) throws RemoteException;
}

