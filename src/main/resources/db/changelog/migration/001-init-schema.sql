--liquibase formatted sql
-- changeset agaf:1

CREATE TABLE public.demo (
	id int8 NOT NULL,
	input_value jsonb NULL,
	output_value jsonb NULL,
	CONSTRAINT demo_pkey PRIMARY KEY (id)
);