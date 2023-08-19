-- Table: public.person

-- DROP TABLE IF EXISTS public.person;

CREATE TABLE IF NOT EXISTS public.person
(
    person_id integer NOT NULL DEFAULT nextval('person_person_id_seq'::regclass),
    username character varying(50) COLLATE pg_catalog."default" NOT NULL,
    age integer,
    phone character varying(15) COLLATE pg_catalog."default" NOT NULL,
    height integer,
    email character varying(250) COLLATE pg_catalog."default" NOT NULL,
    cpf character varying(11) COLLATE pg_catalog."default" NOT NULL,
    birthday character varying(10) COLLATE pg_catalog."default",
    address_id integer,
    CONSTRAINT person_pkey PRIMARY KEY (person_id),
    CONSTRAINT person_cpf_key UNIQUE (cpf),
    CONSTRAINT person_email_key UNIQUE (email),
    CONSTRAINT person_username_key UNIQUE (username),
    CONSTRAINT person_address_id_fkey FOREIGN KEY (address_id)
        REFERENCES public.address (address_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.person
    OWNER to postgres;