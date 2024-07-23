/*

querys for postgres sgdb
.........................................................................
database jpafcstoragedb
select * from information_schema.tables where table_schema = 'public';
select * from tbbalanca;
select * from tbhardware;
select * from tbtime_tbjogador;

select 
 jg.nome
,jg.posicao
,tm.nome as clube
from tbjogador jg INNER JOIN tbtime tm ON jg.id = 1;

select 
 jg.nome
,jg.posicao
,tm.nome as clube
from tbjogador jg INNER JOIN tbtime tm ON jg.id is not null;

select * from information_schema.tables where table_schema = 'public';
select * from tbplayer;
select * from tbaddress;
select * from tbsalary;
select * from tbcoach;
select * from tbreferee;

select 
 nome
,sobrenome
,cpf
,rua
,cidade
,bairro
from tbreferee INNER JOIN tbaddress ON tbreferee.id = 1;

select * from tbcontact; 

drop table tbhardware_tbprovider;
--------------------------------------------------
stop in
GenericDAO em PessoaController
00:10:59
Serviço Genérico - Estruturando o Projeto
00:37:42, 00:33:27
00:35:33 -> ponto importante

 Persistindo Pessoa e Atividade @OneToMany
 Persistindo Pessoa e Endereço @OneToOne
 Mapeando Pessoa e Endereço @OneToOne , @OneToMany
(JPQL) consultas por data usando BETWEEN
(JPQL) Consultando atividade por atributo no BD
-----------------------------------------------------------

..............................................................
 Class
Player
Team

UM JOGADOR(Player) TEM UM TIME(Team) -> @OneToOne
UM Time(Team) TEM VARIOS JOGADORES(Team) -> @OneToMany

OBS.: EXISTE UM RECURSO IMPORTANTE EM JPA QUE E O CASCADE - 
CASCATA. ESTE RECURSO DA ESPECIFICACAO JPA NOS DA A COMODIDADE
DE NAO PERSISTIRMOS AS CLASSES FILHAS. BASTA, PORNTATO, 
PERSISTIR A CLASSE PAI.
...............................................................
code part in Java Lang
... 001
public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DeveloperSoccerClubPU");
        
        Player player001 = new Player("Ronaldinho", "Bruxo", "888.888.888-88", "Atacante", 50000);
        Player player002 = new Player("Romário", "Baixinho", "147.888.888-88", "Atacante", 70000);
        Player player003 = new Player("Ronaldo", "Fenômeno", "888.978.888-14", "Atacante", 90000);
        Player player004 = new Player("Zico", "Galinho", "111.975.548-98", "Atacante", 65000);
        Player player005 = new Player("Bebeto", "Neto", "695.328.971-38", "Atacante", 53000);
        
        List<Player> players = new ArrayList<>();
        players.add(player001);
        players.add(player002);
        players.add(player003);
        players.add(player004);
        players.add(player005);
        
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        
        for(Player p : players) {
            em.persist(p);
        }
        
        em.getTransaction().commit();
        
        emf.close();
    }
...

... 002
public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);
        PrintStream so = System.out;
        
        so.println("INFORME OS DADOS DO JOGADOR");
        so.print("NOME: ");
        String nome = input.nextLine();
        so.print("SOBRENOME: ");
        String sobrenome = input.nextLine();
        so.print("CPF: ");
        String cpf = input.nextLine();
        so.print("POSICAO: ");
        String posicao = input.nextLine();
        so.print("SALARIO: ");
        Float salario = input.nextFloat();
        
        Player player = new Player(nome, sobrenome, cpf, posicao, salario);
                
        EntityManager em = JpaUtil.openConnection();
        em.getTransaction().begin();
                
            em.persist(player);
                
        em.getTransaction().commit();
        
        JpaUtil.closeConnection();
    }
...

*/
