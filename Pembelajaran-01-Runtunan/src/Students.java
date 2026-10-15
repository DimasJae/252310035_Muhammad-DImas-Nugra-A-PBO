public class Students {
    // Atribut (sesuaikan dengan class diagram dosen)
    String namaLengkap;
    String npm;
    String kelas;
    int semester;
    double ipk;

    void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
        System.out.println("Nama Lengkap : " + namaLengkap);
    }

    void setNpm(String npm) {
        this.npm = npm;
        System.out.println("NPM          : " + npm);
    }

    void setKelas(String kelas) {
        this.kelas = kelas;
        System.out.println("Kelas        : " + kelas);
    }

    void setSemester(int semester) {
        this.semester = semester;
        System.out.println("Semester     : " + semester);
    }

    void setIpk(double ipk) {
        this.ipk = ipk;
        System.out.println("IPK          : " + ipk);
    }
}
