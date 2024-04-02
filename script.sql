select
    c.nombre,
    c.documento,
    c.telefono,
    c.direccion,
    c.email,
    c.vetado,
    ir.id as ir_id,
    ir.fechainiciorenta as ir_fechainiciorenta,
    ir.fechafinrenta as_fechafinrenta,
    i.id as i_id,
    i.nombre as i_nombre,
    i.descripcion as i_descripcion,
    i.fechalanzamiento as i_fechalanzamiento,
    i.tarifaxdia as i_tarifaxdia,
    i.formatorenta as i_formatorenta ,
    i.genero as i_genero,        
    ti.id as ti_id,
    ti.descripcion as ti_descripcion
    FROM VI_CLIENTES as c 
    left join VI_ITEMRENTADO as ir on c.documento=ir.CLIENTES_documento 
    left join VI_ITEMS as i on ir.ITEMS_id=i.id 
    left join VI_TIPOITEM as ti on i.TIPOITEM_id=ti.id 

          SELECT id as i_id, nombre as i_nombre, descripcion as i_descripcion, fechalanzamiento as i_fechalanzamiento, tarifaxdia as i_tarifaxdia, formatorenta as i_formatorenta, genero as i_genero, TIPOITEM_id FROM VI_ITEMS;