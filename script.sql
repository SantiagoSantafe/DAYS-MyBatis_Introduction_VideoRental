SELECT
    c.nombre,
    c.documento,
    c.telefono,
    c.direccion,
    c.email,
    c.vetado,
    ir.id as ir_id,
    ir.fechainiciorenta as ir_fechainiciorenta,
    ir.fechafinrenta as ir_fechafinrenta,
    i.id as i_id,
    i.nombre as i_nombre,
    i.descripcion as i_descripcion,
    i.fechalanzamiento as i_fechalanzamiento,
    i.tarifaxdia as i_tarifaxdia,
    i.formatorenta as i_formatorenta,
    i.genero as i_genero,
    ti.id as ti_id,
    ti.descripcion as ti_descripcion
FROM VI_CLIENTES as c
LEFT JOIN VI_ITEMRENTADO as ir ON c.documento = ir.CLIENTES_documento
LEFT JOIN VI_ITEMS as i ON ir.ITEMS_id = i.id
LEFT JOIN VI_TIPOITEM as ti ON i.TIPOITEM_id = ti.id;


SELECT id as ti_id, descripcion as ti_descripcion FROM VI_TIPOITEM;

          SELECT i.id as i_id, i.nombre as i_nombre, i.descripcion as i_descripcion, i.fechalanzamiento as i_fechalanzamiento, i.tarifaxdia as i_tarifaxdia, i.formatorenta as i_formatorenta, i.genero as i_genero, TIPOITEM_id FROM VI_ITEMS as i;