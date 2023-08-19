-- Table: public.address

-- DROP TABLE IF EXISTS public.address;

CREATE TABLE IF NOT EXISTS public.address
(
    address_id integer NOT NULL DEFAULT nextval('address_address_id_seq'::regclass),
    zip integer,
    street character varying(100) COLLATE pg_catalog."default" NOT NULL,
    complement character varying(50) COLLATE pg_catalog."default",
    nighborhood character varying(50) COLLATE pg_catalog."default",
    city character varying(50) COLLATE pg_catalog."default" NOT NULL,
    state character varying(20) COLLATE pg_catalog."default" NOT NULL,
    country character varying(20) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT address_pkey PRIMARY KEY (address_id),
    CONSTRAINT address_city_key UNIQUE (city),
    CONSTRAINT address_country_key UNIQUE (country),
    CONSTRAINT address_state_key UNIQUE (state),
    CONSTRAINT address_street_key UNIQUE (street)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.address
    OWNER to postgres;