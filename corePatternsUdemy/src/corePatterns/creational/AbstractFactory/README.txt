Abstract Factory - Factory of Factories
        (Abstracts the factory class itself)

        eg) JAXP
                    DocumentBuilderFactory   --> Abstract Factory
                        DocumentBuilder      --> Factory
                            Document



     Our example hierarchy:

     Dao
     ---
     XMLEmpDao      DBEmpDao

     XMLDeptDao     DBDeptDa0


     DaoProducer
     -----------

     DaoAbstractFactory (Factory of Factories)

     XMLDaoFactory          DBDaoFactory
